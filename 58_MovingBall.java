import java.awt.*;
import javax.swing.*;

public class MovingBall extends JPanel implements Runnable {
    int x = 0;
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, 100, 30, 30);
    }
    public void run() {
        while(true) {
            x++;
            repaint();
            try { Thread.sleep(10); } catch(Exception e) {}
        }
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        MovingBall m = new MovingBall();
        f.add(m); f.setSize(400, 300); f.setVisible(true);
        new Thread(m).start();
    }
}
