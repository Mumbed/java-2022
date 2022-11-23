import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class DC extends JFrame{

    public DC(){
        super("원 그리기");
        buildGUI();
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildGUI(){
        //add(new JButton());
        //f.add(new CircleCanvas());
        add(new CircleCanvas());
    }



    public static void main(String[] args){
//        JFrame.setDefaultLookAndFeelDecorated(true);
        new DC();
    }
}
