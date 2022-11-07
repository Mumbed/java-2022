import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloEx1  implements ActionListener {

    private JFrame frame;
    private JTextField text;
    private JLabel label;
    public HelloEx1() {
        frame = new JFrame("HelloEx1");

        buildGUI();

        frame.setSize(200,80);
        frame.setLocation(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private void buildGUI() {
        text = new JTextField();
        JButton button = new JButton("확인");
        button.addActionListener(this);
        label = new JLabel("Hello World");

        frame.add(text, BorderLayout.CENTER);
        frame.add(button, BorderLayout.EAST);
        frame.add(label,BorderLayout.SOUTH);
    }
    public static void main(String[] args){
        new HelloEx1();
    }
    public void actionPerformed(ActionEvent e){
        String name = text.getText();
        label.setText("Hello, " + name);
        text.setText("");
    }
}
