class NumberDemo {
  public static void main(String args[]) {
    int i = 123;
    System.out.println("i = " + i);

    long l = 123L;
    System.out.println("l = " + l);

    float f = 1.23f;
    System.out.println("f = " + f);

    double d = 1.23;
    System.out.println("d = " + d);

    i = 0xff;
    System.out.println("Now i = " + i);

    i = 011;
    System.out.println("Now i = " + i);

    i = 0b1100;
    System.out.println("Now i = " + i);

    l = 123_357_890_111L;
    System.out.println("Now l = " + l);
  }
}
