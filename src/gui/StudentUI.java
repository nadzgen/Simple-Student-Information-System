package gui;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class StudentUI extends JFrame {

    public StudentUI() {
        setTitle("Manage Students");
        setSize(900, 600);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(16,16));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(16,16,16,16));
        mainPanel.setBackground(Color.WHITE);

        // FORM PANEL
        JPanel formPanel = new JPanel(new GridLayout(3,4,16,16));
        formPanel.setBorder(BorderFactory.createTitledBorder("Student Information"));

        JTextField idField = new JTextField();
        JTextField firstNameField = new JTextField();
        JTextField lastNameField = new JTextField();
        JComboBox<String> programBox = new JComboBox<>();
        JComboBox<String> yearBox = new JComboBox<>(new String[]{"1","2","3","4"});
        JComboBox<String> genderBox = new JComboBox<>(new String[]{"Male","Female"});

        formPanel.add(new JLabel("Student ID"));
        formPanel.add(idField);
        formPanel.add(new JLabel("First Name"));
        formPanel.add(firstNameField);
        formPanel.add(new JLabel("Last Name"));
        formPanel.add(lastNameField);
        formPanel.add(new JLabel("Program Code"));
        formPanel.add(programBox);
        formPanel.add(new JLabel("Year"));
        formPanel.add(yearBox);
        formPanel.add(new JLabel("Gender"));
        formPanel.add(genderBox);

        // BUTTONS
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,16,0));

        JButton addBtn = new JButton("Add Student");
        addBtn.setBackground(new Color(47,128,237));
        addBtn.setForeground(Color.WHITE);

        JButton deleteBtn = new JButton("Delete Student");
        deleteBtn.setForeground(new Color(214,69,69));

        JButton sortBtn = new JButton("Sort by Last Name");

        buttonPanel.add(addBtn);
        buttonPanel.add(deleteBtn);
        buttonPanel.add(sortBtn);

        // SEARCH PANEL
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,16,0));
        JTextField searchField = new JTextField(20);
        JButton searchBtn = new JButton("Search");
        searchPanel.add(new JLabel("Search by Last Name"));
        searchPanel.add(searchField);
        searchPanel.add(searchBtn);

        // TABLE
        String[] columns = {"ID","First Name","Last Name","Program","Year","Gender"};
        DefaultTableModel model = new DefaultTableModel(columns,0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JPanel topPanel = new JPanel(new BorderLayout(16,16));
        topPanel.add(formPanel, BorderLayout.CENTER);
        topPanel.add(buttonPanel, BorderLayout.SOUTH);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(searchPanel, BorderLayout.CENTER);
        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }
}
