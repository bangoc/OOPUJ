class BorderDecorator extends Decorator {
  public BorderDecorator(VisualComponent component, int width) {
    super(component);
    this.width = width;
  }
  public void draw() {
    super.draw();
    DrawBorder();
  }
  private void DrawBorder() {
    System.out.println("Draw border with width = " + width);
  }
  private int width;
}