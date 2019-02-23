// A simple class hierarchy

class TwoDShape {
  double width;
  double height;
  void showDim() {
    System.out.println("Width and height are " +
                width + " and " + height);
  }
}

class Rectangle extends TwoDShape {
  String style;
  double area() {
    return width * height;
  }
  void showStyle() {
    System.out.println("Rectangle is " + style);
  }
}

class Shapes {
  public static void main(String args[]) {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle();

    // Members of TwoDShape are still available for
    // Rectangle objects
    r1.width = 3.0;
    r1.height = 5.0;
    r1.style = "filled";

    r2.width = 8.0;
    r2.height = 12.0;
    r2.style = "outlined";

    System.out.println("Infor for r1: ");
    r1.showStyle();
    r1.showDim();
    System.out.println("Area is " + r1.area());

    System.out.println("Infor for r2: ");
    r2.showStyle();
    r2.showDim();
    System.out.println("Area is " + r2.area());
  }
}