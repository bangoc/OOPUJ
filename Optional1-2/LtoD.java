// Demonstrate automatic conversion from long to double
class LtoD {
  public static void main(String args[]) {
    long L;
    double D;
    L = 100123285L;
    D = 123.231;

    D = L;  // Ok
    // L = D;  // Not ok, not o widening conversion
  }
}