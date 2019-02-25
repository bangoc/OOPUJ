package packone;

class C {
  void processI() {
    B obj = new B();

    // C is in packone with B, so i is accessible
    obj.i = 100;
    System.out.println(obj.i);
  }
}