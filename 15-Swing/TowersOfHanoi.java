import java.awt.*;
import javax.swing.*;

public class TowersOfHanoi extends Canvas {
    public void paint(Graphics g) {
        // Basic Frame
        g.drawLine(50,350,450,350);
        g.drawLine(150,350,150,200);
        g.drawString("Start",130,375);
        g.drawLine(250,350,250,200);
        g.drawString("Spare",230,375);
        g.drawLine(350,350,350,200);
        g.drawString("Destination",330,375);
        
        // Disks
        g.setColor(Color.green);
        g.fillOval(133, 270, 35, 20);
        g.setColor(Color.yellow);
        g.fillOval(125, 290, 50, 20);
        g.setColor(Color.cyan);
        g.fillOval(115, 310, 70, 20);
        g.setColor(Color.blue);
        g.fillOval(105, 330, 90, 20);
        
        g.setColor(Color.red);
        g.fillOval(340, 310, 25, 20);
        g.setColor(Color.orange);
        g.fillOval(330, 330, 45, 20);
        
    }

    public static void main(String[] args) {
        TowersOfHanoi t = new TowersOfHanoi();
        JFrame f = new JFrame();
        f.add(t);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
