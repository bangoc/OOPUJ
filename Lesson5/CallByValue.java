// primitive types are passed by value
class Test {
  void noChange(int i, int j) {
    i += j;
    j = -j;
  }
}

class CallByValue{
  public static void main(String args[]) {
    Test ob = new Test();
    int a = 15, b = 20;
    System.out.println("a and b before call: " +
                      a + " " + b);
    ob.noChange(a, b);
    System.out.println("a and b after call: " +
                      a + " " + b);
  }
}