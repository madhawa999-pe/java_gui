import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx1 extends JFrame {

    public BorderLayoutEx1() {
        super("Border Layout Example");
        setup();
    }

    private void setup() {
        getContentPane().setLayout(new BorderLayout());

        getContentPane().add(new JButton("Red"), BorderLayout.NORTH);
        getContentPane().add(new JButton("Green"), BorderLayout.SOUTH);
        getContentPane().add(new JButton("Yellow"), BorderLayout.EAST);
        getContentPane().add(new JButton("Blue"), BorderLayout.WEST);
        getContentPane().add(new JButton("White"), BorderLayout.CENTER);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutEx1();
    }
}
