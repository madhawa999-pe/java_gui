import java.awt.*;

public class MyFirstWindow extends Frame {
    public MyFirstWindow(String title) throws HeadlessException{
        super(title);
        setup();
    }
    private void setup(){
        setBackground(Color.cyan);
        setSize(200,200);
        add(new Label("Hello World"));
        setVisible(true);
        setLayout(null);
    }
    public static void main(String[]args){
        MyFirstWindow w = new MyFirstWindow("My first Window");
    }
}
