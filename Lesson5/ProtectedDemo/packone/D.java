package packone;

class D extends B {
  void processI() {
    // D is a subclass of B,
    // so protected member from B is accessible
    i = 100;
    System.out.println(i);
  }
}