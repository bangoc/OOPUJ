// Use a local class
class LocalClassDemo {
  public static void main(String args[]) {

    // An inner class
    class Rectangle {
      int a, b;
      Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
      }
      int getArea() {
        return a * b;
      }
    }

    Rectangle r = new Rectangle(10, 20);
    System.out.println("The rectangle area is: " + r.getArea());
  }
}