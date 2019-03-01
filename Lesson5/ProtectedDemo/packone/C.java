package packone;

class C {
  void processI() {
    B obj = new B();

    // C is in packone with B,
    // so you can access B protected members from C
    obj.i = 100;
    System.out.println(obj.i);
  }
}