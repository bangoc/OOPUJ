// Demonstrate an array overrun
class ArrayErr {
  public static void main(String args[]) {
    int sample[] = new int[10];
    int i = 0;

    // Generate an array overrun
    for (i = 0; i < 100; ++i)
      sample[i] = i;
  }
}