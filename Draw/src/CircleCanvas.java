import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class CircleCanvas extends JComponent{
//    int x, y;
    //Point p;
    ArrayList<Point> pointlist = new ArrayList();
    public CircleCanvas(){
        registerEventListener();
    }
    public void registerEventListener(){
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                pointlist.add(new Point(x, y));
                System.out.println(x+ ", "+y);
                repaint();
            }
        });
    }
    @Override
    public void paint(Graphics g) {
            g.setColor(new Color(255, 0, 0));
//            g.fillOval(p.x, p.y, 50, 50);
            for(Point p : pointlist){
                g.fillOval(p.x, p.y, 50, 50);
            }

    }
}
