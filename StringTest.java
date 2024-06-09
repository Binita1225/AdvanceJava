import  javax.swing.*;
import java.awt.*;

public class StringTest {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Nist");
        jf.setBounds(100, 100, 500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel =new JPanel(){
        public void paint(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.BLACK);
            g2d.setFont(new Font("Times New Roman", Font.ITALIC,20));
            g2d.drawString("We are learning Advance Java", 70,70);
        }
        };


        jf.add(panel);
        jf.setVisible(true);
        jf.setLayout(null);
    }
}
