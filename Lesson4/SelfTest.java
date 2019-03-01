// @bangoc, SOICT-HUST
//
// Find and explain issues in the following
// inheritances.
//
// For inheritances, those are valid, please
// explain all new things in subclasses
//
// Also, please explain the output of this App
// (main method), what behaviors are expected?
class B {
  void Foo() {
    System.out.println("B.Foo");
  }
}
class D1 extends B {
  int Foo() {
    return 0;
  }
}
class D2 extends B {
  void Foo(int x) {
    System.out.println("D2.Foo");
  }
}
class D3 extends B {
  private void Foo() {
    System.out.println("D3.Foo");
  }
}
class D4 extends B {
  void Foo() {
    System.out.println("D4.Foo");
  }
}

class SelfTest {
  public static void main(String args[]) {
    {
      B b = new D2();
      D2 d2 = new D2();
      b.Foo(10);
      d2.Foo(10);
    }
    {
      B b = new D4();
      D4 d4 = new D4();
      b.Foo();
      d4.Foo();
    }
  }
}