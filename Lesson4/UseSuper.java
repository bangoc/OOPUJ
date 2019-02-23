// Use super to call a superclass constructor
// and overcome name hidden by subclass member
class B {
  int i;
  B(int a) {
    i = a;
  }
}

class D extends B {
  int i;
  D(int a, int b) {
    super(a);
    i = b;
  }

  int getSuperI() {
    return super.i;
  }
}

class UseSuper {
  public static void main(String args[]) {
    D obj = new D(10, 20);
    System.out.println(obj.i);
    System.out.println(obj.getSuperI());
  }
}