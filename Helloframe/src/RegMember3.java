import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegMember3 extends JFrame {
    JFrame f = new JFrame();
    private JRadioButton []gender = new JRadioButton[2];
    private JTextArea intr_myself = new JTextArea(9, 22);
    private JCheckBox[] hobby = new JCheckBox[4];
    private JTextField name_textfield = new JTextField("", 8);
    private JTextField id_textfield1 = new JTextField("", 6);
    private JTextField id_textfield2 = new JTextField("", 7);
    private JTextField address_textfield = new JTextField("", 22);
    private JTextField department_textfield = new JTextField("", 8);

    public RegMember3(){
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
        hobby_panel.add(createCheckboxpanel());
        name_hobby_gridPanel.add(name_gender_panel);
        name_hobby_gridPanel.add(id_panel);
        name_hobby_gridPanel.add(adress_panel);
        name_hobby_gridPanel.add(department_panel);
        name_hobby_gridPanel.add(hobby_panel);


        name_textfield.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JTextField t1=(JTextField)e.getSource();
                intr_myself.append(t1.getText()+"\n");
            }
        });

        id_textfield1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e2) {
                // TODO Auto-generated method stub
                JTextField t2=(JTextField)e2.getSource();
                intr_myself.append(t2.getText()+"-");
            }
        });
        id_textfield2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e3) {
                // TODO Auto-generated method stub
                JTextField t3=(JTextField)e3.getSource();
                intr_myself.append(t3.getText()+"\n");
            }
        });
        address_textfield.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e4) {
                // TODO Auto-generated method stub
                JTextField t4=(JTextField)e4.getSource();
                intr_myself.append(t4.getText()+"\n");
            }
        });
        department_textfield.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e5) {
                // TODO Auto-generated method stub
                JTextField t5=(JTextField)e5.getSource();
                intr_myself.append(t5.getText()+"\n");
            }
        });
        gender[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e6) {
                // TODO Auto-generated method stub
//                JTextField t6=(JTextField)e6.getSource();
                intr_myself.append("남자"+"\n");
            }
        });
        gender[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e7) {
                // TODO Auto-generated method stub
                intr_myself.append("여자"+"\n");
            }
        });
        hobby[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e8) {
                // TODO Auto-generated method stub
                intr_myself.append("영화"+"\n");
            }
        });
        hobby[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e9) {
                // TODO Auto-generated method stub
                intr_myself.append("음악감상"+"\n");
            }
        });
        hobby[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e10) {
                // TODO Auto-generated method stub
                intr_myself.append("사진"+"\n");
            }
        });
        hobby[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e11) {
                // TODO Auto-generated method stub
                intr_myself.append("운동"+"\n");
            }
        });

        return name_hobby_gridPanel;
    }
    private JPanel createInputPanel2(){
        JPanel myself_btn_border = new JPanel(new BorderLayout());

        JLabel lb6 = new JLabel("자기소개");
        myself_btn_border.add(lb6,BorderLayout.NORTH);
        myself_btn_border.add(intr_myself,BorderLayout.CENTER);
        JPanel p3 = new JPanel(new FlowLayout());
        myself_btn_border.add(p3,BorderLayout.SOUTH);
        return myself_btn_border;
    }
    private JPanel createCheckboxpanel() {
        String [] hobby_name = {"영화", "음악감상","사진","운동"};
        for(int i = 0; i< hobby_name.length; i++) {
            hobby[i] = new JCheckBox(hobby_name[i]);
        }
        JPanel panel = new JPanel();
        for(JCheckBox r : hobby) {
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
        new RegMember3();
    }
}
