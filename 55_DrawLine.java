import java.awt.*;
import javax.swing.*;

public class DrawLine extends JFrame {
    public void paint(Graphics g) {
        g.drawLine(50, 50, 200, 200);
    }
    public static void main(String[] args) {
        DrawLine d = new DrawLine();
        d.setSize(300, 300);
        d.setVisible(true);
    }
}
