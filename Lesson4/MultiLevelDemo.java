class TwoDShape {
  double width;
  double height;
  TwoDShape(double w, double h) {
    width = w;
    height = h;
  }
}

class Rectangle extends TwoDShape {
  String style;
  Rectangle(String s, double w, double h) {
    super(w, h);
    style = s;
  }
}

class ColorRectangle extends Rectangle {
  String color;
  ColorRectangle(String c, String s, double w, double h) {
    super(s, w, h);
    color = c;
  }
}

class MultiLevelDemo {
  public static void main(String args[]) {
    ColorRectangle r1 = new ColorRectangle("blue", "filled", 3.0, 5.0);
    ColorRectangle r2 = new ColorRectangle("red", "outlined", 6.0, 8.0);
    System.out.println("Infor for r1: \n" +
          "width = " + r1.width + "\n" +
          "height = " + r1.height + "\n" +
          "style = " + r1.style + "\n" +
          "color = " + r1.color);
    System.out.println("Infor for r2: \n" +
          "width = " + r2.width + "\n" +
          "height = " + r2.height + "\n" +
          "style = " + r2.style + "\n" +
          "color = " + r2.color);
  }
}