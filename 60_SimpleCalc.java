import javax.swing.*;
import java.awt.*;

public class SimpleCalc {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calc");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b = new JButton("Add");
        JLabel l = new JLabel("Result");
        
        b.addActionListener(e -> {
            int res = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
            l.setText("Result: " + res);
        });

        f.setLayout(new GridLayout(4,1));
        f.add(t1); f.add(t2); f.add(b); f.add(l);
        f.setSize(200, 300); f.setVisible(true);
    }
}
