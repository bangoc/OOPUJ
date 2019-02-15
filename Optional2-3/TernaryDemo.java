class TernaryDemo {
  public static void main(String args[]) {
    int val = -10;
    int abs = val < 0? -val: val;
    System.out.println("|" + val + "| = " + abs);

    val = 20;
    abs = val < 0? -val: val;
    System.out.println("|" + val + "| = " + abs);
  }
}