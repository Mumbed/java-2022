import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuActionEventEx extends JFrame {
    private JLabel imgLabel = new JLabel();
    public MenuActionEventEx(){
        setTitle("Menu에 Action 리스너 만들기 예제");

        createMenu();
        buildGUI();
        setSize(250,220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildGUI() {
        add(imgLabel);
    }
    private void createMenu() {
        JMenuBar mb = new JMenuBar();
        this.setJMenuBar(mb);

        JMenu screenMenu = new JMenu("Screen");
        mb.add(screenMenu);

        JMenuItem [] menuItem = new JMenuItem[4];
        String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};

        MenuActionListener listener = new MenuActionListener();

        for(int i = 0; i < menuItem.length; i++) {
            menuItem[i] = new JMenuItem(itemTitle[i]);
            menuItem[i].addActionListener(listener);
            screenMenu.add(menuItem[i]);
        }

    }
    class MenuActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();

            switch(cmd){
                case "Load" :
                    if(imgLabel.getIcon() != null)
                        return;
                    imgLabel.setIcon(new ImageIcon("img.png"));
                    break;
                case "Hide" :
                    imgLabel.setVisible(false);
                    break;
                case "ReShow" :
                    imgLabel.setVisible(true);
                    break;
                case "Exit" :
                    System.exit(0);
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new MenuActionEventEx();
    }
}