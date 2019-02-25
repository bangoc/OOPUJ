package packtwo;

class D extends packone.B {
  void processI() {
    // D is a subclass of B,
    // so protected member from B is accessible
    i = 200;
    System.out.println(i);
  }
}