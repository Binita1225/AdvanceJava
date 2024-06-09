import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Image {
    public static void main(String[] args) throws MalformedURLException {
        JFrame jf = new JFrame();

        URL url =new URL("https://images.unsplash.com/photo-1714138667773-0fb47dccaf43?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwxfHx8ZW58MHx8fHx8");
        ImageIcon i = new ImageIcon(url);

            //ImageIcon img =new ImageIcon("https://images.unsplash.com/photo-1714138667773-0fb47dccaf43?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwxfHx8ZW58MHx8fHx8");

            JLabel label = new JLabel(i);

            jf.add(label);

        jf.setBounds(100, 100, 500, 500);

        jf.setVisible(true);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
