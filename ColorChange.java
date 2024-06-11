import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ColorChange {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

       frame.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               Graphics g = frame.getGraphics();
               super.mouseClicked(e);
               g.setColor(Color.GREEN);
               g.fillOval(e.getX(), e.getY(), 10,10);
           }
       });

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
