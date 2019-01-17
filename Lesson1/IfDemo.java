class IfDemo {
  public static void main(String args[]) {
    int a = 2;
    int b = 3;
    if (a < b)
      System.out.println("a is less than b");
    if (a == b)
      System.out.println("you won't see this");
    int c = b - a;
    System.out.println("c contains " + c);
    if (c < 0) {
      System.out.println("c is negative");
    } else if (c > 0) {
      System.out.println("c is non-negative");
    }
  }
}