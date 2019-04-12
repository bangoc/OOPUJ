class ScrollDecorator extends Decorator {
  public ScrollDecorator(VisualComponent component) {
    super(component);
  }
  public void draw() {
    super.draw();
    DrawScroll();
  }
  private void DrawScroll() {
    System.out.println("Draw scroll");
  }
}