// Demonstrate variable-length arguments
class VarArgsOverload {
  static void vaTest(int ... v) {
    System.out.println("vaTest(int ...) Number of args: " + v.length);
    System.out.println("Contents: ");
    for (int i = 0; i < v.length; ++i)
      System.out.println(" arg " + i + " : " + v[i]);
    System.out.println();
  }

  static void vaTest(boolean ... v) {
    System.out.println("vaTest(boolean ...) Number of args: " + v.length);
    System.out.println("Contents: ");
    for (int i = 0; i < v.length; ++i)
      System.out.println(" arg " + i + " : " + v[i]);
    System.out.println();
  }

  public static void main(String args[]) {
    vaTest(1, 2, 3);
    vaTest(true, false, false);
    // vaTest();
  }
}