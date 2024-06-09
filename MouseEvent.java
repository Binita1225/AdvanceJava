import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

public class MouseEvent {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Mouse Event");

        JLabel label = new JLabel("No mouse event");

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {

                label.setText("mouse clicked ");
            }

           /* @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                label.setText("mouse pressed");

            }*/

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                label.setText("mouse released");
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                label.setText("mouse Entered");
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                label.setText("mouseExited");
            }
        });

        jf.add(label);
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
