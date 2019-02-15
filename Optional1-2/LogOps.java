// Demonstrate logical operators
class LogOps {
  public static void main(String args[]) {
    boolean p, q;
    p = true;
    q = true;
    System.out.println("p\tq\t&\t|\t^\t&&\t||");
    System.out.println(p + "\t" +
                       q + "\t" +
                       (p & q) + "\t" +
                       (p | q) + "\t" +
                       (p ^ q) + "\t" +
                       (p && q) + "\t" +
                       (p || q) + "\t");
    p = true;
    q = false;
    System.out.println(p + "\t" +
                       q + "\t" +
                       (p & q) + "\t" +
                       (p | q) + "\t" +
                       (p ^ q) + "\t" +
                       (p && q) + "\t" +
                       (p || q) + "\t");
    p = false;
    q = true;
    System.out.println(p + "\t" +
                       q + "\t" +
                       (p & q) + "\t" +
                       (p | q) + "\t" +
                       (p ^ q) + "\t" +
                       (p && q) + "\t" +
                       (p || q) + "\t");
    p = false;
    q = false;
    System.out.println(p + "\t" +
                       q + "\t" +
                       (p & q) + "\t" +
                       (p | q) + "\t" +
                       (p ^ q) + "\t" +
                       (p && q) + "\t" +
                       (p || q) + "\t");
  }
}