class B {
  final int TEN = 10;
  final int TWENTY = 20;

  final void finalMethod() {
    System.out.println("You can not override a final method");
  }
}

class D extends B {
  // error: can not override a final method of superclass
  // void finalMethod() {
  //   System.out.println("This is indeed a big suprise!");
  // }
}

final class FinalClass {
  FinalClass() {
    System.out.println("You can not override a final class");
  }
}

// Error: It is not allow to subclass a final class
// class Suprise extends FinalClass {
//   Suprise() {
//     System.out.println("It should be a big suprise if you can inherit a final class");
//   }
// }

class FinalDemo {
  public static void main(String args[]) {
    B obj = new B();
    System.out.println(obj.TEN);

    // Error: you can not change the value of a final variable
    // obj.TEN = 100;
  }
}