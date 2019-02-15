// A promotion suprise
class PromDemo {
  public static void main(String args[]) {
    byte b;
    int i;
    b = 10;
    i = b * b;
    b = 10;
    // b = b * b;  // Illegal, because b is promoted to int
    b = (byte)(b * b);
    System.out.println("i and b: " + i + " " + b);
  }
}