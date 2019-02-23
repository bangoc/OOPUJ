// Object is a special class, implicitly Object
// is superclass of all other classes

class C {
}

class ObjectDemo {
  public static void main(String args[]) {
    Object obj = new C();
    Object arr = new int[100];
    System.out.println(arr.equals(obj));
  }
}