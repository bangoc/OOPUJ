class A {
  void foo() {
    System.out.println("A");
  }
}
class B extends A {
  void foo() {
    System.out.println("B");
  }
}
class C extends B {
  void foo() {
    System.out.println("C");
  }
}
class D extends C {
  void foo() {
    System.out.println("D");
  }
}

class OverrideMethod {
  public static void main(String args[]) {
    D obj = new D();
    A a = obj;
    a.foo();
    B b = obj;
    b.foo();
    C c = obj;
    c.foo();

    obj.foo();
  }
}