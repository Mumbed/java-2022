// 일반 클래스 사용- 모듈화, 번거로움,
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloEx1_4 {

    private JFrame frame;
    private JTextField text;
    private JLabel label;
    public HelloEx1_4() {
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
        label = new JLabel("Hello World");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String name = text.getText();
                label.setText("Hello, " + name);
                text.setText("");0
            }
        });


        frame.add(text, BorderLayout.CENTER);
        frame.add(button, BorderLayout.EAST);
        frame.add(label,BorderLayout.SOUTH);
    }

//    private ActionListener handler = new ActionListener(){
//        public void actionPerformed(ActionEvent e){
//            String name = text.getText();
//            label.setText("Hello, " + name);
//            text.setText("");
//        }
//    };
    public static void main(String[] args){
        new HelloEx1_4();
    }


}