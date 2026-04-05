import java.awt.*;
import javax.swing.*;

public class BarChart extends JFrame {
    public void paint(Graphics g) {
        g.setColor(Color.RED); g.fillRect(50, 100, 50, 150); // Value 150
        g.setColor(Color.BLUE); g.fillRect(120, 150, 50, 100); // Value 100
        g.setColor(Color.GREEN); g.fillRect(190, 50, 50, 200); // Value 200
    }
    public static void main(String[] args) {
        BarChart b = new BarChart();
        b.setSize(300, 300); b.setVisible(true);
    }
}
