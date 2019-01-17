import javax.swing.JFrame;
class SwingDemo {
  public static void main(String[] args) {
    JFrame myWindow = new JFrame();
    myWindow.setSize(300, 200);
    myWindow.setTitle("Swing demo");
    myWindow.setVisible(true);
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}