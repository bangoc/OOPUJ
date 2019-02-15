class IntDemo {
  public static void main(String args[]) {
    byte byte_max = Byte.MAX_VALUE;
    byte byte_min = Byte.MIN_VALUE;
    System.out.println("Type byte, min: " + byte_min +
                       " max: " + byte_max);

    short short_max = Short.MAX_VALUE;
    short short_min = Short.MIN_VALUE;
    System.out.println("Type short, min: " + short_min +
                       " max: " + short_max);

    int int_max = Integer.MAX_VALUE;
    int int_min = Integer.MIN_VALUE;
    System.out.println("Type int, min: " + int_min +
                       " max: " + int_max);

    long long_max = Long.MAX_VALUE;
    long long_min = Long.MIN_VALUE;
    System.out.println("Type long, min: " + long_min +
                       " max: " + long_max);
  }
}