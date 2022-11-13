import javax.swing.*;
import java.awt.*;

public class applecar extends JFrame {
    public applecar(){
        super("BasicDrawing");
        buildGUI();

        setLocation(500,200);
        setSize(400,300);
        setTitle("자동차 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildGUI(){
        BasicCanvas drawingCanvas = new BasicCanvas();
        add(drawingCanvas);
    }
    class BasicCanvas extends JComponent{
//        static final int x = 150;
//        static final int y = 100;
        @Override
        public void paint(Graphics g){
//            g.drawString("Hello, World",x,y);
            Color c = new Color(255,0,0,128);
            g.setColor(c);
            g.fillRect(100,110,200,40);
            g.fillRect(150,70,100,50);

            g.setColor(Color.BLACK);
            g.fillOval(125,150,30,30);
            g.fillOval(245,150,30,30);
            g.drawLine(50,180,350,180);
//            g.drawRect(100,110,200,40);
//            g.drawRect(150,70,100,40);
//            g.drawOval(125,150,30,30);
//            g.drawOval(245,150,30,30);
//            g.drawLine(50,180,350,180);
        }
    }

    public static void main(String[] args) {
        new applecar();
    }
}