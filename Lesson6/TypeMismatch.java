// What is the output? Why?
class TypeMismatch {
  public static void main(String args[]) {
    int nums[] = new int[5];
    try {
      System.out.println("Before exception is generated");
      nums[10] = 100;
      System.out.println("This won't be displayed");
    } catch (ArithmeticException exc) {
      System.out.println("Arithmetic exception!");
    }
    System.out.println("*****");
  }
}