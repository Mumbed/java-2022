import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
public class paintCanvas extends JComponent {
    JFrame frame = new JFrame();
    static final int width = 50;
    static final int height = 50;
    int x ,y;
    ArrayList<Point> pointlist = new ArrayList<Point>();
    int dragID = -1;

    public paintCanvas(){

        this.frame.setLocation(500,200);

        this.frame.setSize(400,300);
        this.frame.setTitle("Paint EX");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
//    private void registerEventListener(){
//        addMouseListener(new MouseAdapter(){
//            public void mousePressed(MouseEvent e) {
//                int x = e.getX();
//                int y = e.getY();
//                repaint();
//            }
//        });
//        addMouseMotionListener(new MouseMotionAdapter(){
//
//        });
//    }
    public void paint(Graphics g){
        super.paint(g);
        Color c = new Color(255,0,0);
        g.setColor(c);
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
        g.fillOval(x,y,width,height);
    }
    public static void main(String[] args){
        new paintCanvas();
    }
}
