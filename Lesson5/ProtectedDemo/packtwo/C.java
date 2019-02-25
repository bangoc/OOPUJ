package packtwo;

class C {
  void processI() {
    packone.B obj = new packone.B();

    // error: C is in a different package from B
    // obj.i = 100;
    // System.out.println(obj.i);

    System.out.println("Can not access protected member of a class " +
                       "from non-subclasses in different package.");
  }
}