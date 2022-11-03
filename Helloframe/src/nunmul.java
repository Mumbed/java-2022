import javax.swing.*;
import java.awt.*;
public class nunmul {
    public static void main(String[] args){
        JFrame f = new JFrame();
        JPanel p1 = new JPanel(new GridLayout(5,1));
        JPanel p2 = new JPanel(new BorderLayout());
        JLabel lb1= new JLabel("성명");
        JTextField text1 = new JTextField("        ");
        JLabel lb11 = new JLabel("성별");
        JTextField text11 = new JTextField("   ");
        JLabel lb2= new JLabel("주민등록번호");
        JTextField text2 = new JTextField("       ");
        JLabel lb3= new JLabel("주소");
        JTextField text3 = new JTextField("                      ");
        JLabel lb4= new JLabel("부서명");
        JTextField text4 = new JTextField("        ");
        JLabel lb5= new JLabel("취미");
        JTextField text5 = new JTextField("                      ");
        p1.add(lb1);
        p1.add(text1);
        p1.add(lb2);
        p1.add(text2);
        p1.add(lb3);
        p1.add(text3);
        p1.add(lb4);
        p1.add(text4);
        p1.add(lb5);
        p1.add(text5);
        JTextArea text6 = new JTextArea(9,22);
        JButton btn1 = new JButton("저장");
        btn1.setBounds(0,0,30,30);
        JButton btn2 = new JButton("종료");
        JLabel lb6 = new JLabel("자기소개");
        p2.add(lb6,BorderLayout.NORTH);
        p2.add(text6,BorderLayout.CENTER);
        JPanel p3 = new JPanel(new FlowLayout());
        p3.add(btn1);
        p3.add(btn2);
        p2.add(p3,BorderLayout.SOUTH);
        f.add(p1,BorderLayout.NORTH);
        f.add(p2,BorderLayout.CENTER);
        f.setTitle("사원 등록");
        f.setBounds(100,100,400,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
