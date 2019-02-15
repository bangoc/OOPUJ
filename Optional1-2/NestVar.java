class NestVar {
  public static void main(String args[]) {
    int x = 100;
    {
      // int x = 200;  // Illegal in Java
    }
    System.out.println("In Java, a variable declared within an inner scope is not allowed" +
                       " to have the same name as a variable declared by an enclosing" +
                       " scope");
  }
}