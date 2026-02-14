import javax.swing.*;
import java.awt.*;

public class GridLayoutEx1 extends JFrame {

    String[] labels = {"Yellow", "Green", "Orange", "Red", "Blue", "White","Label1","Label2"};

    public GridLayoutEx1() {
        super("Grid Layout Example");
        setup();
    }

    private void setup() {
        getContentPane().setLayout(new GridLayout(4, 2));

        for (String label : labels) {
            getContentPane().add(new JButton(label));
        }

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx1();
    }
}
