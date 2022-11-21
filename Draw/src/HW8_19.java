import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
public class HW8_19 extends JFrame{
    public HW8_19(){
        super("HW8_19");
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
        private void registerEventListener(){
            addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent e) {
                    Point p1 = new Point();
                    p1.x = e.getX();
                    p1.y = e.getY();
                    pointlist.add(p1);
                    repaint();
                }
            });
            addMouseMotionListener(new MouseMotionAdapter(){
                public void mouseDragged(MouseEvent e) {
                    }
                    });
        }
        public void paint(Graphics g){
            super.paint(g);
            Color c = new Color(255,0,0);
            for(int i= 0;i<pointlist.size();i++){
                g.setColor(c);
                g.fillOval(pointlist.get(i).x, pointlist.get(i).y,width,height);
            }
        }

    }
    public static void main(String[] args){
        new HW8_19();
    }
}

