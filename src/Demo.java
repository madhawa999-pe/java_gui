import javax.swing.*;

public class Demo extends JFrame {

    public Demo() {
        setTitle("Order & Inventory - SKU Detail (POS)");
        setSize(600, 260);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JButton btnNew = new JButton("New");
        JButton btnSearch = new JButton("Search");
        JButton btnPrint = new JButton("Print");

        btnNew.setBounds(20, 15, 80, 25);
        btnSearch.setBounds(110, 15, 80, 25);
        btnPrint.setBounds(200, 15, 80, 25);

        add(btnNew);
        add(btnSearch);
        add(btnPrint);


        JLabel lblNumber = new JLabel("Name");
        JLabel lblDate = new JLabel("Qty");
        JLabel lblPrice = new JLabel("Price");

        lblNumber.setBounds(30, 70, 80, 25);
        lblDate.setBounds(30, 105, 80, 25);
        lblPrice.setBounds(30, 140, 80, 25);

        add(lblNumber);
        add(lblDate);
        add(lblPrice);


        JTextField txtNumber = new JTextField();
        JTextField txtDate = new JTextField();
        JTextField txtPrice = new JTextField();

        txtNumber.setBounds(120, 70, 300, 25);
        txtDate.setBounds(120, 105, 300, 25);
        txtPrice.setBounds(120, 140, 300, 25);

        add(txtNumber);
        add(txtDate);
        add(txtPrice);


        JButton btnContinue = new JButton("Continue");
        btnContinue.setBounds(330, 180, 90, 25);
        add(btnContinue);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
