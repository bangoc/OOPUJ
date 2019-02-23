class A {
  A() {
    System.out.println("Constructing A");
  }
}

class B extends A {
  B() {
    System.out.println("Constructing B");
  }
}

class C extends B {
  C() {
    System.out.println("Constructing C");

    // error: call to super must be first statement in constructor
    // super();
  }
}

class OrderOfConstruction {
  public static void main(String args[]) {
    C c = new C();
  }
}