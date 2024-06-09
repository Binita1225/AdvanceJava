import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEvent {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Button Event");

        JButton button = new JButton("Click me");
        button.setBounds(200,200,100,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
                JOptionPane.showMessageDialog(jf, "Button Clicked");
            }
        });

        jf.add(button);
        jf.setLayout(null);
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
