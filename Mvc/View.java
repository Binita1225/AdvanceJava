package Mvc;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JLabel counterLabel;
    private JButton incrementButton;

    public View() {
        // Set up the frame
        setTitle("MVC Increment Counter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the label and button
        counterLabel = new JLabel("0");



        incrementButton = new JButton("Increment");

        // Arrange components in the frame
        setLayout(new BorderLayout());
        add(counterLabel, BorderLayout.CENTER);
        add(incrementButton, BorderLayout.SOUTH);
    }

    public void setCounter(int count) {
        counterLabel.setText(String.valueOf(count));
    }

    public JButton getIncrementButton() {
        return incrementButton;
    }
}
