/*
  Drills: Construct a textview with border width = 2
*/

class DecoratorDemo {
  public static void main(String args[]) {
    TextView view = new TextView();
    ScrollDecorator scroll_view = new ScrollDecorator(view);
    BorderDecorator border_scroll_view = new BorderDecorator(scroll_view, 3);
    border_scroll_view.draw();
  }
}