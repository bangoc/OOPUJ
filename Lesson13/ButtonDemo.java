/*
  Thêm hai bút Left và Right tương tự
  Up và Down
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {
  JLabel jlab;
  ButtonDemo() {
    JFrame jfrm = new JFrame("A Button Example");

    jfrm.setLayout(new FlowLayout());
    jfrm.setSize(220, 90);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton jbtnUp = new JButton("Up");
    JButton jbtnDown = new JButton("Down");

    jbtnUp.addActionListener(this);
    jbtnDown.addActionListener(this);

    jfrm.add(jbtnUp);
    jfrm.add(jbtnDown);

    jlab = new JLabel("Press abutton.");
    jfrm.add(jlab);

    jfrm.setVisible(true);
  }
  public void actionPerformed(ActionEvent ae) {
    if (ae.getActionCommand().equals("Up")) {
      jlab.setText("You pressed Up.");
    } else {
      jlab.setText("You pressed down.");
    }
  }
  public static void main(String args[]) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new ButtonDemo();
      }
    });
  }
}