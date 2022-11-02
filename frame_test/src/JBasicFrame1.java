import javax.swing.*;
import java.awt.*;

//프레임 만들기
public class JBasicFrame1 {
    private JFrame frame;

    public JBasicFrame1(){
        frame = new JFrame("Frame Test1");
//        frame.setTitle("test");
//        frame.setSize(200,300);
//        frame.setLocation(100,200);
        buildGUI();
        frame.setBounds(100,200,200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    void buildGUI(){
        //frame.setLayout(null);
        //frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //frame.setLayout(new GridLayout(2,0));
        frame.setLayout(new BorderLayout());
        // 위 아래 = 보더 or 그리드 크기에 따라 다름
        //JButton btn = new JButton("확인");
        //Container cp = (Container) frame.getContentPane().add(btn);
        //JButton btn1 = new JButton("취소");
        //frame.add(btn);
        //frame.add(btn1);
        JButton btn;
//        for(int i = 0; i < 5 ; i++ ){
//            btn = new JButton("" + (i + 1));
//            //btn.setBounds(0,40* i,100,30);
//            frame.add(btn);
//        }
        btn = new JButton("1");
        frame.add(btn,BorderLayout.NORTH);
        btn = new JButton("2");
        frame.add(btn,BorderLayout.EAST);
        btn = new JButton("3");
        frame.add(btn,BorderLayout.SOUTH);
        btn = new JButton("4");
        frame.add(btn,BorderLayout.WEST);
        btn = new JButton("5");
        frame.add(btn,BorderLayout.CENTER);


    }
}