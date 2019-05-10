/*
  Giải thích và sửa lỗi biên dịch
  chương trình này.
*/

interface IFoo {
  void sayHello();
  double getValue();
}

class Anonym {
  public static void main(String args[]) {
    IFoo foo = new IFoo() {
      public void sayHello() {
        System.out.println("This is an anonymous class.");
      }
      double getValue() {
        return 10.0;
      }
    };
    foo.sayHello();
    System.out.println(foo.getValue());
  }
}