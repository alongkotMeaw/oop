package lap10_calculater;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test {

    static int count1 = 0;
    static int count2 = 0;

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Button Counter");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 1)); // Grid layout with 2 rows and 1 column

        // Create panels for each row
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Create text fields to display counts
        JTextField textField1 = new JTextField("Count: 0");
        textField1.setEditable(false); // Make the text field non-editable
        JTextField textField2 = new JTextField("Count: 0");
        textField2.setEditable(false); // Make the text field non-editable

        // Add components to the panels
        panel1.add(button1);
        panel1.add(textField1);
        panel2.add(button2);
        panel2.add(textField2);

        // Add panels to the frame
        frame.add(panel1);
        frame.add(panel2);

        // Create a single ActionListener for both buttons
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1) {
                    count1++;
                    textField1.setText("Count: " + count1);
                } else if (e.getSource() == button2) {
                    count2++;
                    textField2.setText("Count: " + count2);
                }
            }
        };

        // Attach the same ActionListener to both buttons
        button1.addActionListener(buttonListener);
        button2.addActionListener(buttonListener);

        // Make the frame visible
        frame.setVisible(true);
    }
}
