import java.util.Arrays;

public class DuckSortDemo {
  public static void main(String[] args) {
    Duck[] ducks = {
      new Duck("Daffy", 8),
      new Duck("Dewey", 2),
      new Duck("Howard", 7),
      new Duck("Louine", 2),
      new Duck("Donald", 10),
      new Duck("Huey", 2)
    };

    System.out.println("Before sorting:");
    display(ducks);

    // Sorting an array in Java is quite straightforward
    // it is required that the class implement the Java
    // Comparable interface
    Arrays.sort(ducks);
    System.out.println("\nAfter sorting:");
    display(ducks);
  }
  public static void display(Duck[] ducks) {
    for (int i = 0; i < ducks.length; ++i) {
      System.out.println(ducks[i]);
    }
  }
}