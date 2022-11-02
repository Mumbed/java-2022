import javax.swing.*;
import java.awt.*;

//프레임 만들기
public class template {
    private JFrame frame;
    public template() {
        frame = new JFrame("사원 등록");
        //buildGUI();
        createInputPanel();
        frame.setBounds(100, 200, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    private void buildGUI() {
        JTextField text = new JTextField(10);
        JButton button = new JButton("확인");
        JLabel label = new JLabel("Hello World");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(text);
        panel.add(button);
        panel.setBackground(Color.ORANGE);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);
    }
    private JPanel createInputPanel() {
//        frame.setLayout(new GridLayout(5,1));
        JPanel mygridpanel = new JPanel(new GridLayout(8,1));
//        JTextField text = new JTextField(20);
        JLabel user = new JLabel("성명" + "성별");
        JTextField username = new JTextField(20);
        JLabel ID = new JLabel("주민등록번호");
        JLabel address = new JLabel("주소");
        JLabel com = new JLabel("부서명");
        JLabel hobby = new JLabel("취미");
        JLabel myself = new JLabel("자기소개");
        JButton button = new JButton("확인");
//        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //panel.add(text);
//        panel.add(button);
//        panel.setBackground(Color.ORANGE);
//        frame.add(panel, BorderLayout.CENTER);
        mygridpanel.add(user);
        mygridpanel.add(username);
        mygridpanel.add(ID);
        mygridpanel.add(address);
        mygridpanel.add(com);
        mygridpanel.add(hobby);
        mygridpanel.add(myself);
        frame.add(mygridpanel, BorderLayout.NORTH);
        return mygridpanel;
    }
    public static void main(String[] args) {
        new template();
        //new JBasicFrame1();
    }
}
