// Initialize one object with another
class Summation {
  int sum;

  Summation(int num) {
    sum = 0;
    for (int i = 1; i <= num; ++i)
      sum += i;
  }

  Summation(Summation ob) {
    sum = ob.sum;
  }
}

class SumDemo {
  public static void main(String args[]) {
    Summation s1 = new Summation(5);
    Summation s2 = new Summation(s1);

    System.out.println("s1.sum: " + s1.sum);
    System.out.println("s2.sum: " + s2.sum);
  }
}