// Run this example.
// Try remove the catch clause of subclass and run
//   this example again.
// Try swap two catch clauses, so the superclass
//   is in the first place,
//   then recompile this example.
class CatchOrder {
  public static void main(String args[]) {
    int number[] = {1, 2, 3, 5, 6, 9, 10};
    int denom[] = {2, 0, 3, 0, 2};
    for (int i = 0; i < number.length; ++i) {
      try {
        System.out.println(number[i] + "/" +
                denom[i] + " = " +
                number[i]/denom[i]);
      } catch(ArrayIndexOutOfBoundsException exc) {
        System.out.println("No matching element!");
      } catch (Throwable exc) {
        System.out.println("Some error occured.");
      }
    }
  }
}