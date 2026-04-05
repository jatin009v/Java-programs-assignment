import java.awt.*;
import javax.swing.*;

public class ColorButton {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click Me");
        b.addActionListener(e -> b.setBackground(Color.CYAN));
        f.add(b);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}
