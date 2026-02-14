import javax.swing.*;
import java.awt.*;

public class Pos extends JFrame {

    public Pos() {
        setTitle("POS Example");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set frame background
        getContentPane().setBackground(Color.BLACK);
        getContentPane().setLayout(new BorderLayout());

        // Top panel (transparent so black shows through)
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.setOpaque(false); // transparent
        topPanel.add(new JButton("Home"));
        topPanel.add(new JButton("About"));
        topPanel.add(new JButton("Exit"));
        getContentPane().add(topPanel, BorderLayout.NORTH);

        // Middle panel (inside wrapper)
        JPanel wrapper = new JPanel(new BorderLayout());
        wrapper.setOpaque(false); // transparent
        wrapper.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel midPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        midPanel.setOpaque(false); // transparent
        midPanel.add(new JLabel("Name"));
        midPanel.add(new JTextField());
        midPanel.add(new JLabel("Address"));
        midPanel.add(new JTextField());
        midPanel.add(new JLabel("City"));
        midPanel.add(new JTextField());

        wrapper.add(midPanel, BorderLayout.CENTER);
        getContentPane().add(wrapper, BorderLayout.CENTER);

        // Bottom panel
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.setOpaque(false); // transparent
        bottomPanel.add(new JButton("Checkout"));
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Pos();
    }
}
