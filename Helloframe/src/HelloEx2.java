import javax.swing.*;
import java.awt.*;

public class HelloEx2 {
    private JFrame frame;

    public HelloEx2() {
        frame = new JFrame("HelloEx2");

        buildGUI();

        frame.setSize(190,90);
        frame.setLocation(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private void buildGUI() {
        JTextField text = new JTextField(10);
        JButton button = new JButton("확인");
        JLabel label = new JLabel("Hello World");

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
        panel.add(text);
        panel.add(button);

        frame.add(panel,BorderLayout.CENTER);
    }
    public static void main(String[] args){
        new HelloEx2();
    }
}
