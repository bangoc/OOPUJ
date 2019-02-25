class ByTwos implements Series {
  int start;
  int val;
  ByTwos() {
    start = val = 0;
  }
  public int getNext() {
    val += 2;
    return val;
  }
  public void reset() {
    val = start;
  }
  public void setStart(int x) {
    start = val = x;
  }
}

class SeriesDemo {
  public static void main(String args[]) {
    ByTwos ob = new ByTwos();
    for (int i = 0; i < 5; ++i) {
      System.out.println("Next value is: " + ob.getNext());
    }

    System.out.println("Resetting...");
    for (int i = 0; i < 5; ++i) {
      System.out.println("Next value is: " + ob.getNext());
    }

    System.out.println("Starting at 100");
    ob.setStart(100);
    for (int i = 0; i < 5; ++i) {
      System.out.println("Next value is: " + ob.getNext());
    }
  }
}