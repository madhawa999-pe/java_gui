import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx1 extends JFrame {

    String[] labels = {"Yellow", "Green", "Orange", "Red", "Blue", "White", "Black"};

    public FlowLayoutEx1() {
        super("Flow Layout Example");
        setup();
    }

    private void setup() {
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

        for (String label : labels) {
            getContentPane().add(new JButton(label));
        }

        //pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 200);
        setVisible(true);
        setLayout(null);
    }

    public static void main(String[] args) {
        new FlowLayoutEx1();
    }
}
