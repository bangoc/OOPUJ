public class TemplateMethodDemo {
  public static void main(String args[]) {
    CaffeineBeverage aCupOfTea = new Tea();
    aCupOfTea.prepareRecipe();

    CaffeineBeverage aCupOfCoffee = new Coffee();
    aCupOfCoffee.prepareRecipe();
  }
}