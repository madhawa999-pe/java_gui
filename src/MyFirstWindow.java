import java.awt.*;

public class MyFirstWindow extends Frame {
    public MyFirstWindow(String title) throws HeadlessException{
        super(title);
        setup();
    }
    private void setup(){
        setTitle("My First App");
        setSize(500, 300);
        setLayout(null);
        setBackground(new Color(59, 78, 92));
        setLocationRelativeTo(null);

        Label lbl = new Label("Hello World", Label.CENTER);
        lbl.setBounds(100, 100, 300, 50);
        lbl.setFont(new Font("Arial", Font.BOLD, 24));
        lbl.setForeground(new Color(186, 154, 220, 100));
        lbl.setBackground(new Color(255, 252, 252, 100));

        add(lbl);

        Button btn = new Button("Hello World");
        btn.setBounds(150, 150, 200, 50);
        btn.setFont(new Font("Arial", Font.BOLD, 24));
        btn.setForeground(Color.WHITE);
        btn.setBackground(Color.BLACK);
        add(btn);

        setVisible(true);
    }
    public static void main(String[]args){
        MyFirstWindow w = new MyFirstWindow("My first Window");
    }
}
