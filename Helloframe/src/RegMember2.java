import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegMember2 extends JFrame {
    JFrame f = new JFrame();
    private JRadioButton []gender = new JRadioButton[2];
    JTextArea intr_myself = new JTextArea(9, 22);
    JRadioButton[] hobby = new JRadioButton[4];
    JTextField name_textfield = new JTextField("", 8);
    JTextField id_textfield1 = new JTextField("", 6);
    JTextField id_textfield2 = new JTextField("", 7);
    JTextField address_textfield = new JTextField("", 22);
    JTextField department_textfield = new JTextField("", 8);
    String hobby1;
    String gender1;
    public RegMember2(){
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
        JPanel name_hobby_gridPanel = new JPanel(new GridLayout(5, 1));
        JPanel name_gender_panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel id_panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel adress_panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel department_panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel hobby_panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JLabel name_label= new JLabel("성     명");
        JLabel gender_label = new JLabel("성   별");
        JLabel id_label = new JLabel("주민등록번호");
        JLabel bar_label = new JLabel(" - ");
        JLabel address_label = new JLabel("주     소");
        JLabel department_label = new JLabel("부  서  명");
        JLabel hobby_label = new JLabel("취     미");
        name_gender_panel.add(name_label);
        name_gender_panel.add(name_textfield);
        name_gender_panel.add(gender_label);
        name_gender_panel.add(createRadioPanel2());
        id_panel.add(id_label);
        id_panel.add(id_textfield1);
        id_panel.add(bar_label);
        id_panel.add(id_textfield2);
        adress_panel.add(address_label);
        adress_panel.add(address_textfield);
        department_panel.add(department_label);
        department_panel.add(department_textfield);
        hobby_panel.add(hobby_label);
        hobby_panel.add(createRadioPanel1());
        name_hobby_gridPanel.add(name_gender_panel);
        name_hobby_gridPanel.add(id_panel);
        name_hobby_gridPanel.add(adress_panel);
        name_hobby_gridPanel.add(department_panel);
        name_hobby_gridPanel.add(hobby_panel);




        return name_hobby_gridPanel;
    }
    private JPanel createInputPanel2(){
        JPanel myself_btn_border = new JPanel(new BorderLayout());

        JButton btn1 = new JButton("저장");
        JButton btn2 = new JButton("종료");
        JLabel lb6 = new JLabel("자기소개");
        myself_btn_border.add(lb6,BorderLayout.NORTH);
        myself_btn_border.add(intr_myself,BorderLayout.CENTER);
        JPanel p3 = new JPanel(new FlowLayout());
        p3.add(btn1);
        btn1.addActionListener(new ActionListener() {
            //            @Override
            public void actionPerformed(ActionEvent e){
                String name = name_textfield.getText();
                if(gender[0].isSelected()){
                    gender1 = "남자";
                }
                else{
                    gender1 = "여자";
                }
                String id1 = id_textfield1.getText();
                String id2 = id_textfield2.getText();
                String address = address_textfield.getText();
                String department = department_textfield.getText();
                    if(hobby[0].isSelected()){
                        hobby1 = "영화";
                    }
                    else if(hobby[1].isSelected()){
                        hobby1 = "음악감상";
                    }
                    else if(hobby[2].isSelected()){
                        hobby1 = "사진";
                    }
                    else{
                        hobby1 = "운동";
                }
                intr_myself.setText(name +"\n"+ gender1 + "\n" +id1+ "-" +id2 +"\n" +address+"\n" + department+ "\n" +hobby1);

            }
        });
        p3.add(btn2);
        myself_btn_border.add(p3,BorderLayout.SOUTH);
        return myself_btn_border;
    }
    private JPanel createRadioPanel1() {
        String [] hobby_name = {"영화", "음악감상","사진","운동"};
        for(int i = 0; i< hobby_name.length; i++) {
            hobby[i] = new JRadioButton(hobby_name[i]);
        }
        ButtonGroup g = new ButtonGroup();
        JPanel panel = new JPanel();
        for(JRadioButton r : hobby) {
            g.add(r);
            panel.add(r);
        }
        return panel;
    }
    private JPanel createRadioPanel2() {
        String [] gender_name = {"남", "여"};
        for(int i = 0; i< gender_name.length; i++) {
            gender[i] = new JRadioButton(gender_name[i]);
        }
        ButtonGroup g = new ButtonGroup();
        JPanel panel = new JPanel();
        for(JRadioButton r : gender) {
            g.add(r);
            panel.add(r);
        }
        return panel;
    }

    public static void main(String[] args) {
        new RegMember2();
    }
}
