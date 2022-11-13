import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class JVectorListTest extends JFrame {
    private JList<String> mList;
    private JTextField mTvInput;
    private JButton mBtnAdd, mBtnDel;

    private Vector<String> mData = new Vector<String>();

    public JVectorListTest(){
        super("JList Test");
        buildGUI();
        registerListener();

        setBounds(100,200,400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildGUI() {
        mData.add("apple");
        mData.add("orange");
        mList = new JList<String>(mData);
        mList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(createInputPanel(), BorderLayout.NORTH);
        add(new JScrollPane(mList), BorderLayout.CENTER);
    }
    private JPanel createInputPanel() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));

        mTvInput = new JTextField(20);
        mBtnAdd = new JButton("추가");
        p.add(mBtnAdd);
        mBtnDel = new JButton("삭제");
        p.add(mBtnDel);
        return p;
    }
    private void registerListener(){
        mBtnAdd.addActionListener(new ActionListener(){
            @Override
                    public void actionPerformed(ActionEvent e) {
                String s = mTvInput.getText();
                mData.add(s);
                mList.updateUI();
                mTvInput.setText("");
            }
        });
        mBtnDel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int idx = mList.getSelectedIndex();

                mData.remove(idx);
                mList.updateUI();
                mTvInput.setText("");
            }
        });
    }
    public static void main(String[] args){
        new JVectorListTest();
    }

}
