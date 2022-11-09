import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//프레임 만들기
public class input_output extends JFrame{
    private JTextField tf= new JTextField(20);
    private JTextArea ta= new JTextArea(7,20);


    public input_output(){
        setTitle("Frame Test3");
        buildGUI();
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void buildGUI(){
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("입력후 <Enter> 키를 입력하세요"));
        c.add(tf);
        c.add(new JScrollPane(ta));
        ///텍스트 필드에 <Enter> 키입력때발생하는 Action 이벤트 리스너 등록
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JTextField t=(JTextField)e.getSource();
                ta.append(t.getText()+"\n");
                t.setText("");
            }
        });
    }
    public static void main(String[] args) {
        new input_output();
    }
}