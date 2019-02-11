class MinMax {
  public static void main(String args[]) {
    int nums[] = {8, 10, -20, 121, 1000, 9, 3, -2, 1, 100000};
    int min, max;
    min = max = nums[0];
    for (int i = 0; i < 10; ++i) {
      if (nums[i] < min)
        min = nums[i];
      if (nums[i] > max)
        max = nums[i];
    }
    System.out.println("Min and max: " + min + " " + max);
  }
}