import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sum {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JLabel num1 = new JLabel("Num1:");
        num1.setBounds(50,50,80,30);
        frame.add(num1);
        JTextField numField1 = new JTextField();
        numField1.setBounds(150,50, 200,30 );
        frame.add(numField1);

        JLabel num2 = new JLabel("Num2:");
        num2.setBounds(50,100,100,30);
        frame.add(num2);
        JTextField numField2 = new JTextField();
        numField2.setBounds(150,100, 200,30 );
        frame.add(numField2);

        JButton button = new JButton("Sum");
        button.setBounds(200, 150, 100, 30);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int firstNum =Integer.parseInt(numField1.getText());
                int secondNum = Integer.parseInt(numField2.getText());
                int sum =firstNum + secondNum;
                JOptionPane.showMessageDialog(frame,"Sum:" +sum);
            }
        });

        frame.setSize(500,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
