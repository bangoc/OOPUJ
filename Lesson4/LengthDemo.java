// Use the length array member.
class LengthDemo {
  public static void main(String args[]) {
    int list[] = new int[10];
    int nums[] = {1, 2, 3};
    int table[][] = {
      {1, 2, 3},
      {4, 5},
      {6, 7, 8, 9}
    };
    System.out.println("Length of list is " + list.length);
    System.out.println("Length of nums is " + nums.length);
    System.out.println("Length of table is " + table.length);
    System.out.println("Table is: ");
    for (int i = 0; i < table.length; ++i) {
      for (int j = 0; j < table[i].length; ++j)
        System.out.print(table[i][j] + "\t");
      System.out.println();
    }
  }
}