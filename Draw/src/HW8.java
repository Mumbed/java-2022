import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
public class HW8 extends JFrame{
    public HW8(){
        super("HW8");
        buildGUI();
        setLocation(500,200);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildGUI(){
        paintCanvas drawingCricle = new paintCanvas();
        add(drawingCricle);
    }

    public class paintCanvas extends JComponent {
        static final int width = 50;
        static final int height = 50;
        int x ,y;
        ArrayList<Point> pointlist = new ArrayList<Point>();
        int dragID = -1;

        public paintCanvas(){
            registerEventListener();
        }
        private void buildGUI() {

        }
        private void registerEventListener(){
            addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent e) {
                    int x = e.getX();
                    int y = e.getY();
                    repaint();
                }
            });
            addMouseMotionListener(new MouseMotionAdapter(){

            });
        }
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
            new HW8();
        }
    }
}

