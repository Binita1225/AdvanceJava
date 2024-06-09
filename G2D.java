import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;


public class G2D {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("Shape");
        jf.setBounds(100, 100, 500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){
            public void  paint(Graphics g){
                Graphics2D g2d =(Graphics2D) g;
                g2d.setColor(Color.GREEN );

                g2d.drawLine(50, 50, 200, 180);
                g2d.setColor(Color.RED);
                //g2d.drawRect(200, 200, 200, 200);
                g2d.setColor(Color.blue);
                g2d.fillRect(200, 200,200,200);

                //g2d.drawOval(50,50, 50, 50);
                g2d.setColor(Color.BLACK);
                g2d.fillOval(90,90,100,100);

                g2d.setStroke(new BasicStroke(10));
                g2d.draw((new Line2D.Float(30, 20, 100, 100)));
                g2d.setColor(Color.DARK_GRAY);
            }

        };
        jf.add(panel);
        jf.setVisible(true);
        jf.setLayout(null);


    }
}
