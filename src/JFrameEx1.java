import javax.swing.*;

public class JFrameEx1 extends JFrame {
    public JFrameEx1() {
        super("My first JFrame");
        setup();
    }

    private void setup() {
        getContentPane().add(new JLabel("Hello World!"));
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameEx1();
    }
}
