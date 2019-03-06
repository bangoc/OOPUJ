// Try to get some descriptions of an exception
//   by getMessage, toString, etc.
class ThrowableDemo {
  static void genException() {
    int a[] = new int[5];
    a[10] = 100;
  }
  public static void main(String args[]) {
    try {
      genException();
    } catch (ArrayIndexOutOfBoundsException exc) {
      System.out.println("index-out-of-bounds");
      exc.printStackTrace();
    }
  }
}