class TickMain {
  public static void main(String args[]) {
    ClockView view = new ClockView();
    ClockControl control = new ClockControl();
    ClockModel model = new ClockModel();
    view.model = model;
    control.view = view;
    control.model = model;

    for (int i = 0; i < 20; ++i) {
      control.tick();
      try {
        Thread.sleep(1000);
      } catch (InterruptedException exc) {
        System.out.println(exc.getMessage());
      }
    }
  }
}