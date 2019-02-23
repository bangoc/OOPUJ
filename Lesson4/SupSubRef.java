class B {
  void sayB() {
    System.out.println("B B B!");
  }
}

class D extends B {
  void sayD() {
    System.out.println("D D D!");
  }
}

class X {
  void sayX() {
    System.out.println("X X X!");
  }
}

class Y {
  void sayY() {
    System.out.println("Y Y Y");
  }
}

class SupSubRef {
  public static void main(String args[]) {
    B b = new B();
    D d = new D();
    X x = new X();
    Y y = new Y();

    // ok: superclass reference can refer to a subclass object
    b = d;
    b.sayB();

    // error: cannot find symbol. Despite that b refer to D object
    // b.sayD();

    // error: incompatible types
    // x = y;
  }
}