class Sup {
  void who() {
    System.out.println("who() in Sup");
  }
}

class Sub1 extends Sup {
  void who() {
    System.out.println("who() in Sub1");
  }
}

class Sub2 extends Sup {
  void who() {
    System.out.println("who() in Sub2");
  }
}

class DynDispDemo {
  public static void main(String args[]) {
    Sup obj = new Sup();
    Sup ob1 = new Sub1();
    Sup ob2 = new Sub2();

    obj.who();
    ob1.who();
    ob2.who();
  }
}