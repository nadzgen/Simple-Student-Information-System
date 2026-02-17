
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    
    public MainFrame() {
        this.setTitle("Student Information System");
        this.setSize(700, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(128, 0, 0));
        leftPanel.setPreferredSize(new Dimension(160, 0));

        ImageIcon icon = new ImageIcon("students.png");
        JLabel iconLabel = new JLabel(icon);
        iconLabel.setPreferredSize(new Dimension(45, 45));
        iconLabel.setHorizontalAlignment(JLabel.CENTER);
        leftPanel.setLayout(new BorderLayout());


        leftPanel.add(iconLabel, BorderLayout.NORTH);

        this.add(leftPanel, BorderLayout.WEST);
        this.setVisible(true);

    }
    
}


