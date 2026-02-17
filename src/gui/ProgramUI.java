package gui;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ProgramUI extends JFrame {

    public ProgramUI() {
        setTitle("Manage Programs");
        setSize(800, 500);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(16,16));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(16,16,16,16));

        JPanel formPanel = new JPanel(new GridLayout(2,2,16,16));
        formPanel.setBorder(BorderFactory.createTitledBorder("Program Information"));

        JTextField codeField = new JTextField();
        JTextField nameField = new JTextField();
        JComboBox<String> collegeBox = new JComboBox<>();

        formPanel.add(new JLabel("Program Code"));
        formPanel.add(codeField);
        formPanel.add(new JLabel("Program Name"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("College Code"));
        formPanel.add(collegeBox);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,16,0));
        JButton addBtn = new JButton("Add Program");
        JButton deleteBtn = new JButton("Delete Program");

        addBtn.setBackground(new Color(47,128,237));
        addBtn.setForeground(Color.WHITE);
        deleteBtn.setForeground(new Color(214,69,69));

        buttonPanel.add(addBtn);
        buttonPanel.add(deleteBtn);

        String[] columns = {"Program Code","Program Name","College Code"};
        DefaultTableModel model = new DefaultTableModel(columns,0);
        JTable table = new JTable(model);

        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(new JScrollPane(table), BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }
}
