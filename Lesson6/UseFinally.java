// finally block will be executed when the try block
// is exited, no matter how.
//
// Inspect the output and the order of executions

class MyException extends Exception {
  public String getMessage() {
    return "My Exception";
  }
}

class UseFinally {
  public static void genException(int what) {
    int nums[] = new int [5];
    System.out.println("Received " + what);
    try {
      try {
        switch(what) {
          case 0:
            System.out.println("Generate divide-by-zero");
            nums[0] = 10 / 0;
            break;
          case 1:
            System.out.println("Generate index-out-of-bounds");
            nums[10] = 0;
            break;
          case 2:
            System.out.println("Leave try without error");
            break;
          case 3:
            System.out.println("Generate MyException");
            throw new MyException();
        }
      } catch(ArithmeticException exc) {
        System.out.println("catched: " + exc.getMessage());
      } catch(ArrayIndexOutOfBoundsException exc) {
        System.out.println("catched: " + exc.getMessage());
        return;
      }
      finally {
        System.out.println("finally handler on " + what);
      }
    } catch(Throwable exc) {
      System.out.println("outer handler! catched " + exc.getMessage());
    }
  }
  public static void main(String args[]) {
    for (int i=0; i < 4; ++i) {
      genException(i);
    }
  }
}