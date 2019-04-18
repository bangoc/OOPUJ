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

class Wrapper {
  public static void main(String args[]) {
    Gen<Integer> i = new Gen<Integer>(100);
    i.showType();
  }
}