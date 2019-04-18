/*
  Drills: Try to create an instance with int argument
*/

class Gen<T> {
  private T obj;
  Gen(T obj) {
    this.obj = obj;
  }
  void showType() {
    System.out.println("Type of T is " + obj.getClass().getName());
  }
}

class Raw {
  public static void main(String args[]) {
    Gen<Integer> i = new Gen<Integer>(100);
    Gen<String> s = new Gen<String>("Hello world");
    i.showType();
    s.showType();
    Gen g = new Gen(10);
    g = i;  // Potentially wrong
    g.showType();
    s = g;  // Potentially wrong
    s.showType();

    s = i;  // Compile error: Incompatible type
  }
}