// Demonstrate method overloading
class Overload {
  void ovlDemo() {
    System.out.println("No parameters");
  }

  void ovlDemo(int a) {
    System.out.println("One parameter: " + a);
  }

  int ovlDemo(int a, int b) {
    System.out.println("Two int parameters: " + a + " " + b);
    return a + b;
  }

  double ovlDemo(double a, double b) {
    System.out.println("Two double parameters: " +
                        a + " " + b);
    return a + b;
  }
}

class OverloadDemo {
  public static void main(String args[]) {
    Overload ob = new Overload();
    int resI;
    double resD;

    // call all versions of ovlDemo()
    ob.ovlDemo();
    System.out.println();

    ob.ovlDemo(2);
    System.out.println();

    resI = ob.ovlDemo(4, 6);
    System.out.println("Result of ob.ovlDemo(4, 6): " +
                        resI);
    System.out.println();

    resD = ob.ovlDemo(1.1, 2.32);
    System.out.println("Result of ob.ovlDemo(1.1, 2.32): " +
                        resD);
  }
}