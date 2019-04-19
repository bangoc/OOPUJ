/*
  Hoan thien ma nguon sau
  Ket qua mong doi:
    20
    10
    Exception
*/

class Stack<V extends Number> {
  V pop() {
    // TODO: Xoa va tra ve phan tu tren dinh
  }
  void push(V value) throws Exception {
    // TODO: them vao dinh hoac nem ngoai le neu day
  }
  Stack(int size) {
    // TODO: khoi tao gia tri bien
  }
  private Number values[] = null;
  private int max_id = 0;
  private int id = -1;
}

class StackDemo {
  public static void main(String args[]) {
    try {
      Stack<Integer> s1 = new Stack<>(10);
      s1.push(10);
      s1.push(20);
      System.out.println(s1.pop());
      System.out.println(s1.pop());
      for (int i = 0; i < 20; ++i) {
        s1.push(i);
      }
    } catch (Exception exc) {
      System.out.println("Exception");
    }
  }
}