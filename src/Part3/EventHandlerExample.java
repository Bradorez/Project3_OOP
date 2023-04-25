package Part3;

import javax.swing.*;
import java.awt.*;

public class EventHandlerExample
{
    public static void main(String[] args)
    {
        JFrame mainFrame = new JFrame("Frame");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);

        JTextField textField1 = new JTextField(15);
        JTextField textField2 = new JTextField(15);
        JTextField textField3 = new JTextField(15);

        JButton button1 = new JButton("Copy to TextField2");
        JButton button2 = new JButton("Copy to TextField3");

        button1.addActionListener(e -> {
            textField2.setText(textField1.getText());
            JOptionPane.showMessageDialog(mainFrame, "Text copied from TextField1 to TextField2");
        });

        button2.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(mainFrame, "Do you want to copy text to TextField3?");
            if (result == JOptionPane.YES_OPTION) {
                textField3.setText(textField2.getText());
                String input = JOptionPane.showInputDialog(mainFrame, "Enter additional text for TextField3");
                if (input != null) {
                    textField3.setText(textField3.getText() + " " + input);
                }
            }
        });

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(textField1);
        panel.add(button1);
        panel.add(textField2);
        panel.add(button2);
        panel.add(textField3);

        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }
}
