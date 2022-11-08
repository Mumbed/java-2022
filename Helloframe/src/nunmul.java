import javax.swing.*;
import java.awt.*;
public class nunmul {
    JFrame f = new JFrame();
    public nunmul(){
        buildGUI();
        f.setTitle("사원 등록");
        f.setBounds(100,100,350,420);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    private void buildGUI(){
        f.add(createInputPanel1(),BorderLayout.NORTH);
        f.add(createInputPanel2(),BorderLayout.CENTER);
    }
    private JPanel createInputPanel1(){
        JPanel p1 = new JPanel(new GridLayout(5, 1));
        JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel p5 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel p6 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel p7 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel p8 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JLabel lb1 = new JLabel("성     명");
        JTextField text1 = new JTextField("", 8);
        JLabel lb11 = new JLabel("성   별");
        JTextField text11 = new JTextField("", 3);
        JLabel lb12 = new JLabel(" - ");
        JTextField text12 = new JTextField("", 7);
        JLabel lb2 = new JLabel("주민등록번호");
        JTextField text2 = new JTextField("", 6);
        JLabel lb3 = new JLabel("주     소");
        JTextField text3 = new JTextField("", 22);
        JLabel lb4 = new JLabel("부  서  명");
        JTextField text4 = new JTextField("", 8);
        JLabel lb5 = new JLabel("취     미");
        JTextField text5 = new JTextField("", 22);
        p4.add(lb1);
        p4.add(text1);
        p4.add(lb11);
        p4.add(text11);
        p5.add(lb2);
        p5.add(text2);
        p5.add(lb12);
        p5.add(text12);
        p6.add(lb3);
        p6.add(text3);
        p7.add(lb4);
        p7.add(text4);
        p8.add(lb5);
        p8.add(text5);
        JTextArea text6 = new JTextArea(9, 22);
        JButton btn1 = new JButton("저장");
        JButton btn2 = new JButton("종료");
        p1.add(p4);
        p1.add(p5);
        p1.add(p6);
        p1.add(p7);
        p1.add(p8);
        return p1;
    }
    private JPanel createInputPanel2(){
        JPanel p2 = new JPanel(new BorderLayout());
        JTextArea text6 = new JTextArea(9, 22);
        JButton btn1 = new JButton("저장");
        JButton btn2 = new JButton("종료");
        JLabel lb6 = new JLabel("자기소개");
        p2.add(lb6,BorderLayout.NORTH);
        p2.add(text6,BorderLayout.CENTER);
        JPanel p3 = new JPanel(new FlowLayout());
        p3.add(btn1);
        p3.add(btn2);
        p2.add(p3,BorderLayout.SOUTH);
        return p2;
    }
    public static void main(String[] args) {
        new nunmul();
    }
}

