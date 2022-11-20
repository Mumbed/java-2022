import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAndFileDialogEx extends JFrame {
    JLabel imageLabel = new JLabel();

    public MenuAndFileDialogEx(){
        super("Menu와 JFileChooser 활용 예제");

        add(imageLabel);
        createMenu();
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void createMenu(){
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);

        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new OpenActionListener());
        fileMenu.add(openItem);
        mb.add(fileMenu);
    }
    class OpenActionListener implements ActionListener{
        JFileChooser chooser;

        OpenActionListner(){
            chooser = new JFileChooser();
        }
        public void actionPerformed(ActionEvent e){
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "JPG & GIF Images","jpg","gif");
            chooser.setFileFilter(filter);
        }
        int ret = chooser.showOpenDialog(MenuAndFileDialogEx.this);

        if(ret != JFileChooser.APPROVE_OPTION){
            JOptionPane.showMessageDialog(MenuAndFileDialogEx.this,"파일을 선택하지 않음");
            return;
        }
        String filePath = chooser.getSelectedFile().getPath();
        imageLabel.setIcon(new ImageIcon(filePath));

        pack();
    }

    public static void main(String[] args){
        new MenuAndFileDialogEx();
    }
}
