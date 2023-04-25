package Part3;

public class Main
{
    import javax.swing.*;
import java.awt.*;

    public class LayoutDemo {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> createAndShowGUI());
        }

        private static void createAndShowGUI() {
            // Create main frame
            JFrame mainFrame = new JFrame("Layout Demo");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setSize(600, 400);

            // BorderLayout
            JPanel borderLayoutPanel = new JPanel(new BorderLayout());
            borderLayoutPanel.add(new JButton("North"), BorderLayout.NORTH);
            borderLayoutPanel.add(new JButton("South"), BorderLayout.SOUTH);
            borderLayoutPanel.add(new JButton("East"), BorderLayout.EAST);
            borderLayoutPanel.add(new JButton("West"), BorderLayout.WEST);
            borderLayoutPanel.add(new JButton("Center"), BorderLayout.CENTER);

            // FlowLayout
            JPanel flowLayoutPanel = new JPanel(new FlowLayout());
            flowLayoutPanel.add(new JLabel("Label"));
            flowLayoutPanel.add(new JButton("Button"));
            flowLayoutPanel.add(new JTextField("Text Field", 10));

            // GridLayout
            JPanel gridLayoutPanel = new JPanel(new GridLayout(2, 2));
            gridLayoutPanel.add(new JButton("1"));
            gridLayoutPanel.add(new JButton("2"));
            gridLayoutPanel.add(new JButton("3"));
            gridLayoutPanel.add(new JButton("4"));

            // BoxLayout
            JPanel boxLayoutPanel = new JPanel();
            boxLayoutPanel.setLayout(new BoxLayout(boxLayoutPanel, BoxLayout.Y_AXIS));
            boxLayoutPanel.add(new JLabel("Label 1"));
            boxLayoutPanel.add(Box.createRigidArea(new Dimension(0, 10)));
            boxLayoutPanel.add(new JLabel("Label 2"));
            boxLayoutPanel.add(Box.createVerticalGlue());
            boxLayoutPanel.add(new JLabel("Label 3"));
            boxLayoutPanel.add(Box.createRigidArea(new Dimension(0, 10)));
            boxLayoutPanel.add(new JLabel("Label 4"));

            // Combine panels
            JPanel mainPanel = new JPanel(new GridLayout(2, 2));
            mainPanel.add(borderLayoutPanel);
            mainPanel.add(flowLayoutPanel);
            mainPanel.add(gridLayoutPanel);
            mainPanel.add(boxLayoutPanel);

            mainFrame.add(mainPanel);
            mainFrame.setVisible(true);
        }
    }

}
