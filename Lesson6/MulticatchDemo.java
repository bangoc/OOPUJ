// Try assign exc to a different object
//   and them recompile. What is the error?

class MulticatchDemo {
  public static void main(String args[]) {
    int number[] = {1, 2, 3, 5, 6, 9, 10};
    int denom[] = {2, 0, 3, 0, 2};
    for (int i = 0; i < number.length; ++i) {
      try {
        System.out.println(number[i] + "/" +
                denom[i] + " = " +
                number[i]/denom[i]);
      } catch(ArithmeticException |
              ArrayIndexOutOfBoundsException exc) {
        System.out.println("catched: " + exc.getMessage());

        // error: implicitly exc is final
        // exc = new ArrayIndexOutOfBoundsException();
      }
    }
  }
}