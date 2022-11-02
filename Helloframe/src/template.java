import javax.swing.*;
import java.awt.*;

//프레임 만들기
public class template {
    private JFrame frame;

    public template() {
        frame = new JFrame("Frame");
//        frame.setTitle("test");
//        frame.setSize(200,300);
//        frame.setLocation(100,200);
        buildGUI();
        createInputPanel();
        frame.setBounds(100, 200, 200, 300);
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
        JTextField text = new JTextField(10);
        JButton button = new JButton("확인");

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(text);
        panel.add(button);

        panel.setBackground(Color.ORANGE);
    }
}
