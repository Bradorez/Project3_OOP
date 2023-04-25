package Part3;
import javax.swing.*;
import java.awt.*;


    public class LayoutDemo
    {
        public static void main(String[] args)
        {
            JFrame mainFrame = new JFrame("Frame");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setSize(800, 400);


            JPanel borderLayoutPanel = new JPanel(new BorderLayout());
            borderLayoutPanel.add(new JButton("North"), BorderLayout.NORTH);
            borderLayoutPanel.add(new JButton("South"), BorderLayout.SOUTH);
            borderLayoutPanel.add(new JButton("East"), BorderLayout.EAST);
            borderLayoutPanel.add(new JButton("West"), BorderLayout.WEST);
            borderLayoutPanel.add(new JButton("Center"), BorderLayout.CENTER);

            JPanel flowLayoutPanel = new JPanel(new FlowLayout());
            flowLayoutPanel.add(new JLabel("Label"));
            flowLayoutPanel.add(new JButton("Button"));
            flowLayoutPanel.add(new JTextField("Text Field", 10));

            JPanel gridLayoutPanel = new JPanel(new GridLayout(2, 2));
            gridLayoutPanel.add(new JButton("text"));

            JPanel boxLayoutPanel = new JPanel();
            boxLayoutPanel.setLayout(new BoxLayout(boxLayoutPanel, BoxLayout.Y_AXIS));
            boxLayoutPanel.add(new JLabel("Label"));


            JPanel mainPanel = new JPanel(new GridLayout(2, 2));
            mainPanel.add(borderLayoutPanel);
            mainPanel.add(flowLayoutPanel);
            mainPanel.add(gridLayoutPanel);
            mainPanel.add(boxLayoutPanel);

            mainFrame.add(mainPanel);
            mainFrame.setVisible(true);

        }


    }


