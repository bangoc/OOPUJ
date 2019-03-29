import java.awt.Frame;
import java.awt.Graphics;
import javax.swing.JFrame;


public class MyFrame extends JFrame {
  public MyFrame(String title) {
    super(title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300, 300);
    this.setVisible(true);
  }
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // TODO: Add your drawing code here
    graphics.drawString("I rule!", 100, 100);
  }
  public static void main(String args[]) {
    MyFrame myFrame = new MyFrame("Template Design Pattern");
  }
}