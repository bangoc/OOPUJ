import javax.swing.*;
import java.awt.*;

public class CalculatorMain {
    public static void main(String args[]) {
        JFrame calculator = new JFrame("Calculator");
        calculator.add(new CalculatorView().calculatorView);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setPreferredSize(new Dimension(600, 150));
        calculator.pack();
        calculator.setLocationRelativeTo(null);
        calculator.setVisible(true);
    }
}
