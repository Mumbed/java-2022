//체크박스 관리
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class RadioButton extends JFrame{
    private JCheckBox [] fruits = new JCheckBox[3];
    private String [] names = {"사과", "배","체리"};
    private JLabel sumLabel;
    public RadioButton(){
        setTitle("라디오버튼 만들기 예제");
        buildGUI();

        setSize(250,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildGUI(){
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(createRadioPanel());
    }
    private JPanel createRadioPanel () {
//이미지 라디오버튼을 만들기 위해 2개의 이미지 객체 생성
        ImageIcon cherryIcon = new ImageIcon("cherry.png"); // 해제 상태를 나태는 이
        ImageIcon selectedCherryIcon = new ImageIcon("selectedcherry.jpg");
//라디오버튼 3개 생성
        String[] fruit_name = {"사과", "배", "체리"};
        JRadioButton[] fruits = new JRadioButton[3];
        for (int i = 0; i < fruit_name.length; i++) {
            fruits[i] = new JRadioButton(fruit_name[i]);
        }
        fruits[1].setSelected(true);
        fruits[2].setIcon(cherryIcon);
        fruits[2].setBorderPainted(true); // 이미지 라디오버튼의 외곽선 출력
        fruits[2].setSelectedIcon(selectedCherryIcon); // 선택 상태 이미지 등록
        ButtonGroup g = new ButtonGroup();
        JPanel panel = new JPanel();

        for (JRadioButton r : fruits) {
            g.add(r);
            panel.add(r);
        }
        return panel;
    }

    public static void main(String[] args){
        new RadioButton();
    }
}