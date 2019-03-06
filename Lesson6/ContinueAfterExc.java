// What is the output?
//
class ContinueAfterExc {
  public static void main(String args[]) {
    int number[] = {1, 2, 3, 5, 6};
    int denom[] = {2, 0, 3, 0, 2};
    for (int i = 0; i < number.length; ++i) {
      try {
        System.out.println(number[i] + "/" +
                denom[i] + " = " +
                number[i]/denom[i]);
      } catch(ArithmeticException exc) {
        System.out.println("Can't divide by Zero!");
      }
    }
  }
}