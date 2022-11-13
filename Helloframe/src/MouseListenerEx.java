import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEx  extends JFrame{
    JLabel la;

    MouseListenerEx(){
        setTitle("Mouse 이벤트 예제");

        buildGUI();
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildGUI() {
        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);

        contentPane.addMouseListener(new MyMouseListener());
        la = new JLabel("hello");
        la.setSize(50,20);
        la.setLocation(30,30);
        contentPane.add(la);
    }
    class MyMouseListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x,y);
        }
    }
//    class MyMouseListener implements MouseListener {
//
//        @Override
//        public void mouseClicked(MouseEvent e) {
//
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {
//            int x = e.getX();
//            int y = e.getY();
//            la.setLocation(x,y);
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent e) {
//
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent e) {
//
//        }
//
//        @Override
//        public void mouseExited(MouseEvent e) {
//
//        }
//    }
    public static void main(String[] args) {
        new MouseListenerEx();
    }
}
