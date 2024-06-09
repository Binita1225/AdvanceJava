import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarLab {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Menu Bar");

        JMenuBar jMenuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        JMenuItem aNew = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(aNew);
        file.add(open);
        file.add(save);
        file.add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jf.setJMenuBar(jMenuBar);

        jMenuBar.add(file);
        jMenuBar.add(edit);
        jMenuBar.add(help);

        //jf.add(jMenuBar);

        jf.setSize(500,500);
        // jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
}
