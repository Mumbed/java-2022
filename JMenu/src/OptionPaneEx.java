import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPaneEx extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4;
    String [] str = {"로그인", "회원가입"};

    public OptionPaneEx(){
        super("JOpthinPane 테스트");

        buildGUI();
        pack();
        setLocation(300,300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildGUI(){
        setLayout(new FlowLayout());
        b1 = new JButton("MessageDialog");
        b2 = new JButton("ConfirmDialog");
        b3 = new JButton("InputDialog");
        b4 = new JButton("OptionDialog");
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();

        if(src == b1){
            JOptionPane.showMessageDialog(this, "메시지다이얼로그박스", "메세지", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(src == b2){
            int n = JOptionPane.showConfirmDialog(this, "확인다이얼로그박스", "확인", JOptionPane.YES_NO_CANCEL_OPTION);
            switch(n){
                case JOptionPane.YES_OPTION: System.out.println("예");
                break;
                case JOptionPane.NO_OPTION: System.out.println("아니오");
                break;
                case JOptionPane.CANCEL_OPTION: System.out.println("취소");
                break;
            }
        }
        else if(src == b3){
            String s= JOptionPane.showInputDialog(this, "입력다이얼로그박스", "입력", JOptionPane.QUESTION_MESSAGE);
            System.out.println(s);
        }
        else if(src == b4) {
            int n = JOptionPane.showOptionDialog(this, "옵션다이얼로그박스", "옵션", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,
                    null,str,str[0]);
            System.out.println(str[n]);
        }
    }
    public static void main(String[] args){
        new OptionPaneEx();
    }
}
