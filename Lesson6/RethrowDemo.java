// Run this example
// Add some codes after the throw clause and
//    recompile this example. Is there any error?
// Remove the throw clause and run this example
//    again. What is the output?
class RethrowDemo {
  static void genException() {
    int number[] = {1, 2, 3, 5, 6, 9, 10};
    int denom[] = {2, 0, 3, 0, 2};
    for (int i = 0; i < number.length; ++i) {
      try {
        System.out.println(number[i] + "/" +
                denom[i] + " = " +
                number[i]/denom[i]);
      } catch(ArrayIndexOutOfBoundsException exc) {
        System.out.println("index-out-of-bounds!");
        throw exc;

        // error: unreachable code
        // System.out.println("after throw");
      } catch(Throwable exc) {
        System.out.println("inner handler!");
      }
    }
  }
  public static void main(String args[]) {
    try {
      genException();
    } catch(Throwable exc) {
      System.out.println("outer handler!");
    }
  }
}