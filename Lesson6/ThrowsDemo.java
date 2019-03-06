// Create a subclass of RuntimeException and
//   a subclass of Error, and add two cases
//   into genException to throw them, but don't catch.
//
// Create one more subclass of Exception and
//   add one more case into genException
//   for it. Then try to compile
//   What is the error? Compare with subclasses
//   of RuntimeException and Error.

class MyException extends Exception {
  public String getMessage() {
    return "My Exception";
  }
}

class ThrowsDemo {
  public static void genException(int what)
      throws MyException {
    int nums[] = new int [5];
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
    }
  }
  public static void main(String args[]) {
    for (int i=0; i < 4; ++i) {
      try {
        genException(i);
      } catch(Throwable exc) {
        System.out.println("outer handler! catched " + exc.getMessage());
      }
    }
  }
}