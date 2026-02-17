package gui;    
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CollegeUI extends JFrame {

    public CollegeUI() {
        setTitle("Manage Colleges");
        setSize(700, 450);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(16,16));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(16,16,16,16));

        JPanel formPanel = new JPanel(new GridLayout(1,2,16,16));
        formPanel.setBorder(BorderFactory.createTitledBorder("College Information"));

        JTextField codeField = new JTextField();
        JTextField nameField = new JTextField();

        formPanel.add(new JLabel("College Code"));
        formPanel.add(codeField);
        formPanel.add(new JLabel("College Name"));
        formPanel.add(nameField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,16,0));
        JButton addBtn = new JButton("Add College");
        JButton deleteBtn = new JButton("Delete College");

        addBtn.setBackground(new Color(47,128,237));
        addBtn.setForeground(Color.WHITE);
        deleteBtn.setForeground(new Color(214,69,69));

        buttonPanel.add(addBtn);
        buttonPanel.add(deleteBtn);

        String[] columns = {"College Code","College Name"};
        DefaultTableModel model = new DefaultTableModel(columns,0);
        JTable table = new JTable(model);

        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(new JScrollPane(table), BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }
}
