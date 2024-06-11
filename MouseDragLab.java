import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseDragLab {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                Graphics g = frame.getGraphics();
                g.setColor(Color.PINK);
                g.fillOval(e.getX(), e.getY(),10,10);
            }
        });

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
