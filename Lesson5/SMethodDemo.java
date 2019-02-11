// Use a static method
class StaticMeth {
  static int Sum(int a, int b) {
    return a + b;
  }
}

class SMethodDemo {
  public static void main(String args[]) {
    System.out.println("10 + 20 = " + StaticMeth.Sum(10, 20));
  }
}