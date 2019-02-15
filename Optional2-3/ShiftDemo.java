// Demonstrate the shift <<, >>, and >>> operators
class ShiftDemo {
  static void ShowBits(int val) {
    int mask = 1 << 31;
    for (int i = 0; i < 32; ++i) {
      if ((val & mask) != 0) System.out.print("1 ");
      else System.out.print("0 ");
      val = val << 1;
    }
    System.out.println();
  }
  public static void main(String args[]) {
    int val = 1;
    for (int i = 0; i < 32; ++i)  {
      ShowBits(val);
      val = val << 1;
    }
    System.out.println();

    val = -1;
    for (int i = 0; i < 32; ++i) {
      ShowBits(val);
      val = val >> 1;
    }
    System.out.println();

    val = -1;
    for (int i = 0; i < 32; ++i) {
      ShowBits(val);
      val = val >>> 1;
    }
    System.out.println();
  }
}
