// Demonstrate lifetime of a variable
class VarLifetimeDemo {
  public static void main(String args[]) {
    int x;
    for (x = 0; x < 3; ++x) {
      int y = -1;
      System.out.println("y is: " + y);
      y = 100;
      System.out.println("y is now: " + y);
    }
  }
}