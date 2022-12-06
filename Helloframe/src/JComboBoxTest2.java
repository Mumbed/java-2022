import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxTest2 extends JFrame{
    private JTextField mTvInput;
    private JComboBox<String> mCombo;
    private JButton mBtnAdd, mBtnDel;
    public JComboBoxTest2(){
        super("JComboBox Test1");

        buildGUI();
        registerEventListener();
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildGUI(){
        setLayout(new FlowLayout());

        mTvInput = new JTextField(10);
        mBtnAdd = new JButton("추가");
        mBtnDel = new JButton("삭제");
        mBtnDel.setEnabled(false);

        String [] fruits = {"apple", "orange", "kiwi", "banana"};
        mCombo = new JComboBox<String>(fruits);

        add(mTvInput);
        add(mBtnAdd);
        add(mBtnDel);
        add(mCombo);
    }
    private void registerEventListener(){
        mBtnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String str = mTvInput.getText();
                mCombo.addItem(str);
                mTvInput.setText("");
            }
        });
        mCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mTvInput.setText((String)mCombo.getSelectedItem());
                mBtnDel.setEnabled(true);
            }
        });
        mBtnDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = mTvInput.getText();
                mCombo.removeItem(str);
            }
        });
    }
    public static void main(String[] args) {
        new JComboBoxTest2();
    }
}
