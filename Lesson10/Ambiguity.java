/*
  Compile this file and explain the error
*/
class MyGen<T, V> {
  void foo(T t) {
  }
  void foo(V v) {
  }
}

class Ambiguity {
  public static void main(String args[]) {
    MyGen<Integer, Double> g = new MyGen<>();
  }
}