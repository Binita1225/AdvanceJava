import javax.swing.*;
import java.awt.event.KeyListener;

public class KeyEvent {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Key Event");

        JLabel label = new JLabel("No key event");

        jf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                label.setText("key Typed");
            }

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                label.setText("key pressed");

            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                label.setText("key released");

            }
        });

        jf.add(label);
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
