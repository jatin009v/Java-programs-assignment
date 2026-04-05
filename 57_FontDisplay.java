import java.awt.*;
import javax.swing.*;

public class FontDisplay extends JFrame {
    public void paint(Graphics g) {
        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.drawString("Serif Bold", 50, 100);
        g.setFont(new Font("Monospaced", Font.ITALIC, 20));
        g.drawString("Monospaced Italic", 50, 150);
    }
    public static void main(String[] args) {
        FontDisplay f = new FontDisplay();
        f.setSize(400, 300);
        f.setVisible(true);
    }
}
