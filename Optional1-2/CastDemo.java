// Demonstrate casting
class CastDemo {
  public static void main(String args[]) {
    double x, y;
    byte b;
    int i;
    char ch;
    x = 10.0;
    y = 3.0;
    i = (int) (x / y);
    System.out.println("Integer outcome of " + x + "/" + y + ": " + i);

    i = 100;
    b  = (byte)i;
    System.out.println("Value of b: " + b); // no loss

    i = 257;
    b = (byte)i;
    System.out.println("Value of b: " + b);  // Information loss this time

    b = 88;
    ch = (char)b;
    System.out.println("ch: " + ch);
  }
}