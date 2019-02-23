abstract class TwoDShape {
  double height, width;
  TwoDShape(double w, double h) {
    height = h;
    width = w;
  }
  abstract double area();
}

class Rectangle extends TwoDShape {
  Rectangle(double w, double h) {
    super(w, h);
  }
  double area() {
    return width * height;
  }
}

// error: Triangle must override area() or be marked as abstract
// class Triangle extends TwoDShape {
//   Triangle(double w, double h) {
//     super(w, h);
//   }
// }

class AbstractDemo {
  public static void main(String args[]) {
    // error: TwoDShape is an abstract class
    // TwoDShape obj = new TwoDShape();
    TwoDShape obj = new Rectangle(3, 5);
    System.out.println("Area of 3 x 5 rectangle is: " + obj.area());
  }
}