class KbIn {
  public static void main(String args[])
      throws java.io.IOException {
    char ch =  (char) System.in.read();
    System.out.println("Your key is: " + ch);
  }
}