import javax.swing.*;
import java.awt.*;

public class Image2 {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {

        JFrame frame = new JFrame("Image Partitions");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new GridLayout(3, 3)); // Partitioning the frame into a 2x2 grid


        ImageIcon imageIcon = new ImageIcon("C:\\Users\\bibek\\Downloads\\pencil.jpg"); // Replace with the actual image path


        for (int i = 0; i < 9; i++) {
            JPanel panel = new JPanel();
            JLabel label = new JLabel(imageIcon);
            panel.add(label);
            frame.add(panel);
        }


        frame.setVisible(true);
    }
}
