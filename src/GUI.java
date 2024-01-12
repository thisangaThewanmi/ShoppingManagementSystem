
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class GUI extends JFrame {

    private JComboBox<String> comboBox;
    private JPanel panel;
    private JPanel panel1;
    private JLabel label;
    private JButton button;
    private JTable table;

    private JLabel label1;

    public GUI() {
        setTitle("Westminster Shopping Center");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Shopping Cart");
        label = new JLabel("Select product category:");

        panel = new JPanel(new FlowLayout());

        // Create a String array with two options
        String[] options = {"Electronics", "Clothing"};

        // Create a JComboBox with the options
        comboBox = new JComboBox<>(options);

        String[] columnNames = {"Column 1", "Column 2", "Column 3", "Column 4", "Column 5", "Column 6"};
        Object[][] data = {
                {"Data 1", "Data 2", "Data 3", "Data 4", "Data 5", "Data 6"},
                {"Data 7", "Data 8", "Data 9", "Data 10", "Data 11", "Data 12"}
                // Add more rows as needed
        };

        table = new JTable(data, columnNames);

        //table = new JTable();
//TabelModel model = new DefaultTableModel(data, columnNames);
        //table.setModel(model);


        //mertama table modl eka hadanna



        // Optionally, you can put the table in a JScrollPane for better display
        JScrollPane scrollPane = new JScrollPane(table);
        //scrollPane.setPreferredSize(new Dimension(580, 300));
        table.setGridColor(Color.BLACK);


        JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
        separator.setPreferredSize(new Dimension(1, table.getHeight())); // Set the height of the separator

        // Create labels for Product Details and Product ID
        JLabel productDetailsLabel = new JLabel("Product Details");
        JLabel productIdLabel = new JLabel("Product ID");

        // Set layout for the main frame
        setLayout(new BorderLayout());

        // Add components to the main frame
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(separator);


        panel.add(label, FlowLayout.LEFT);
        panel.add(comboBox);
        panel.add(button);

        setVisible(true);


        panel.add(label, FlowLayout.LEFT);
        panel.add(comboBox);
        panel.add(button);
        panel.add(scrollPane);




        // add(panel, BorderLayout.NORTH); // Add the panel to the main frame
        // add(scrollPane, BorderLayout.CENTER); // Add the JScrollPane with the table to the main frame

        setVisible(true);
    }


}




