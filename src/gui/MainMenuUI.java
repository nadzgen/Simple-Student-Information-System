package gui;
import javax.swing.*;
import java.awt.*;

public class MainMenuUI extends JFrame {

    public MainMenuUI() {

        setTitle("Student Information System");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon mainIcon = new ImageIcon("src/images/students.png");
        setIconImage(mainIcon.getImage());

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        JLabel title = new JLabel("Student Information System");
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(title);
        panel.add(Box.createVerticalStrut(40));

        JButton studentBtn = createMenuButton("Manage Students");
        JButton programBtn = createMenuButton("Manage Programs");
        JButton collegeBtn = createMenuButton("Manage Colleges");

        studentBtn.addActionListener(e -> new StudentUI());
        programBtn.addActionListener(e -> new ProgramUI());
        collegeBtn.addActionListener(e -> new CollegeUI());

        panel.add(studentBtn);
        panel.add(Box.createVerticalStrut(20));
        panel.add(programBtn);
        panel.add(Box.createVerticalStrut(20));
        panel.add(collegeBtn);

        add(panel);
        setVisible(true);
    }

    private JButton createMenuButton(String text) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btn.setBackground(new Color(47, 128, 237));
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setMaximumSize(new Dimension(300, 60));
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        return btn;
    }
}
