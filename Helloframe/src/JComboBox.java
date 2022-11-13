//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//import java.util.Vector;
//
//public class JComboBox extends JFrame {
//    private Vector<PhoneInfo> mData = new Vector<PhoneInfo>();
//    public JComboBox() {
//        super("JComboBox Test2");
//
//        readData();
//        buildGUI();
//
//        setBounds(120,120,300,100);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);
//    }
//    private void buildGUI() {
//        JComboBox<PhoneInfo> cbox = new JComboBox<PhoneInfo>(mData);
//        cbox.setMaximumRowCount(3);
//        cbox.addItemListener(choiceEventListener);
//        cbox.addActionListener(selectEventListener);
//
//        setLayout(new FlowLayout());
//        add(new JLabel("이름"));
//        add(cbox);
//    }
//    private void readData(){
//        mData.add(new PhoneInfo("홍길동", "1990/01/01", "010-111-2222"));
//        mData.add(new PhoneInfo("일지매", "010-123-4567"));
//        mData.add(new PhoneInfo("이지매", "1990/12/31", "010-99-9999"));
//        mData.add(new PhoneInfo("고주몽", "010-777-6666"));
//    }
//    private ItemListener choiceEventListener = new ItemListener() {
//        public void itemStateChanged(ItemEvent e){
//            if(e.getStateChange() == ItemEvent.SELECTED)
//                System.out.println("Selected...    ");
//            else System.out.println("DeSelected... ");
//
//            ((PhoneInfo) e.getItem()).show();
//            System.out.println();
//        }
//    };
//    private ActionListener selectEventListener = new ActionListener() {
//        public void actionPerformed(ActionEvent e) {
//            JComboBox<PhoneInfo> cb = (JComboBox<PhoneInfo>) e.getSource();
//            System.out.println("선택...    ");
//            ((PhoneInfo) (cb.getSelectedItem())).show();
//            System.out.println();
//        }
//    };
//    class PhoneInfo{
//        private String name;
//        private String birthDay;
//        private String phoneNum;
//
//        PhoneInfo(String name, String birthDay, String phoneNum){
//            this.name = name;
//            this.birthDay = birthDay;
//            this.phoneNum = phoneNum;
//        }
//
//        PhoneInfo(String name, String phoneNum){
//            this(name, null, phoneNum);
//        }
//        void show(){
//            System.out.println(name);
//            if(birthDay != null)
//                System.out.print("(" + birthDay + ")");
//            else
//                System.out.println("\t:" + phoneNum + " ");
//        }
//        public String toString(){
//            return name;
//        }
//    }
//    public static void main(String[] args){
//        new JComboBox();
//    }
//}
//
