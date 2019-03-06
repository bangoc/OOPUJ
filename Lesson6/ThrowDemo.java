// How does MyException in this example relate
// to Throwable?
// Add one statement
//      throw new C();
//   into main() and recompile this example.
//   is there any error?

class MyException extends Exception {
}

class C {}

class ThrowDemo {
  public static void main(String args[]) {
    try {
      throw new MyException();
    } catch (MyException exc) {
      System.out.println("Catched an user defined exception.");
    }

    try {
      throw new ArithmeticException();
    } catch (ArithmeticException exc) {
      System.out.println("Catched an ArithmeticException.");
    }

    // error: incompatible types
    // throw new C();
  }
}