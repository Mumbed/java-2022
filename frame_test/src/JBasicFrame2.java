import javax.swing.*;
import java.awt.*;

public class JBasicFrame2 extends JFrame {

    public JBasicFrame2(){
        super("Frame test2");

        // 프레임 구성
        buildGUI();
        this.setBounds(100,200,200,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    private void buildGUI(){
        JButton btn = new JButton("확인");
        this.add(btn);
    }
}
