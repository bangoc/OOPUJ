class B {
  void show(int a) {
    System.out.println("a = " + a);
  }
}

class D extends B {
  void show(int a, int b) {
    System.out.println("a = " + a + ", b = " + b);
  }
}

class OverloadDemo {
  public static void main(String args[]) {
    B b = new B();
    b.show(1);

    // error: can not call subclass methods through
    // a superclass reference
    // b.show(1, 2);

    D d = new D();
    d.show(1);
    d.show(1, 2);
  }
}