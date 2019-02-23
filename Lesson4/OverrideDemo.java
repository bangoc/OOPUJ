class B {
  void saySmth() {
    System.out.println("B B B!");
  }

  // void show() {
  //   System.out.println("show B B B!");
  // }
}

class D extends B {
  void saySmth() {
    System.out.println("D D D!");
  }

  // error: different return types
  // int show() {
  //   System.out.println("show D D D!");
  //   return 0;
  // }
}

class OverrideDemo {
  public static void main(String args[]) {
    B b = new B();
    D d = new D();
    b.saySmth();
    d.saySmth();

    b = d;
    b.saySmth();
  }
}