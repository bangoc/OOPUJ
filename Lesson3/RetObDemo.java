class Test {
  int a = 10;
  Test(int a) {
    this.a = a;
  }
}

class Data {
  private Test d[] = {new Test(1), new Test(2), new Test(3)};
  Test getData(int i) {
    return d[i];
  }
}

class RetObDemo {
  public static void main(String args[]) {
    Data db = new Data();
    Test obj = db.getData(1);
    System.out.println(obj.a);
    obj.a = 100;
    Test obj2 = db.getData(1);
    System.out.println(obj2.a);
  }
}