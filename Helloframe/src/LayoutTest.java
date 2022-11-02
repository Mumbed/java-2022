import java.awt.*;
import javax.swing.*;
public class LayoutTest {
    JFrame frame;
    public LayoutTest () {
        frame = new JFrame("Layout Test");
        frame.setLayout(new FlowLayout());
//frame.getLayout (new BorderLayout ()) ;
//frame.setLayout (new GridLayout (0, 2));
//frame.setLayout (null);
        JButton btn = new JButton("1");
        frame.add(btn);
//btn. setBounds (0, 10, 100, 30);
        frame.add (new JButton ("2"));
        frame.add (new JButton ("3"));
        frame.add (new JButton ("4"));
        frame.add (new JButton ("5"));
        frame.setSize(300, 200);
        frame.setLocation(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
        public static void main (String[]args){
            new LayoutTest();
        }
    }