// Run this example and describe
// the flow of execution
//
// Try assign to nums[3] and run again
class ExcDemo {
  public static void main(String args[]) {
    int nums[] = new int[5];
    try {
      System.out.println("Before exception is generated");

      // This line will throw
      // ArrayIndexOutOfBoundsException
      nums[10] = 100;
      System.out.println("This won't be displayed");
    } catch (ArrayIndexOutOfBoundsException exc) {
      System.out.println("Index out-of-bounds!");
    }
    System.out.println("After catch statement.");
  }
}