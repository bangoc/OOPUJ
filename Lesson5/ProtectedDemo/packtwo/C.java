package packtwo;

class C {
  void processI() {
    packone.B obj = new packone.B();

    // error: C is not in the same package with B,
    // so you can not access its protected members
    // obj.i = 100;
    // System.out.println(obj.i);

    System.out.println("Can not access protected member of a class " +
                       "from non-subclasses in different package.");
  }
}