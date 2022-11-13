import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WinodowEventTest {
    private JFrame mFrame;
    public WinodowEventTest(){
        mFrame = new JFrame("WindowEvent Test");
        registerEventListener();
        mFrame.setSize(300,200);

        //mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setVisible(true);
    }
    private void registerEventListener(){
        mFrame.addWindowListener(mHandler);

    }
    private WindowListener mHandler = new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("종료합니다");
            System.exit(0);
        }
    };

//        @Override
//        public void windowOpened(WindowEvent e) {
//
//        }
//
//        @Override
//        public void windowClosing(WindowEvent e) {
//            System.out.println("종료합니다");
//            System.exit(0);
//        }
//
//        @Override
//        public void windowClosed(WindowEvent e) {
//
//        }
//
//        @Override
//        public void windowIconified(WindowEvent e) {
//
//        }
//
//        @Override
//        public void windowDeiconified(WindowEvent e) {
//
//        }
//
//        @Override
//        public void windowActivated(WindowEvent e) {
//
//        }
//
//        @Override
//        public void windowDeactivated(WindowEvent e) {
//
//        }
    public static void main(String[] args){
        new WinodowEventTest();
    }
}
