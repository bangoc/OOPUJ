// Run this example
// Remove two elements from denom, and run
//    this example again.
// Explain the output

class NestTrys {
  public static void main(String args[]) {
    int number[] = {1, 2, 3, 5, 6, 9, 10};
    int denom[] = {2, 0, 3, 0, 2, 3, 2};
    try {
      for (int i = 0; i < number.length; ++i) {
        try {
          System.out.println(number[i] + "/" +
                  denom[i] + " = " +
                  number[i]/denom[i]);
        } catch(ArithmeticException exc) {
          System.out.println("Can't divide by zero!");
        }
      }
    } catch (ArrayIndexOutOfBoundsException exc) {
      System.out.println("No matching element found!");
      System.out.println("Fatal error - program terminated!");
    }
  }
}