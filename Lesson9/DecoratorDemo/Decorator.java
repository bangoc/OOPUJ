class Decorator extends VisualComponent {
  public Decorator(VisualComponent component) {
    this.component = component;
  }
  public void draw() {
    component.draw();
  }
  private VisualComponent component;
}