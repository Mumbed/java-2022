import javax.swing.*;
import java.awt.*;

public class LogicalFontEx extends JFrame{
    public LogicalFontEx() {
        super("Logical Font");
        buildGUI();
        setLocation(500,200);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void buildGUI(){
        LogicalFontTestCanvas drawingCanvas = new LogicalFontTestCanvas();
        add(drawingCanvas);
    }
    class LogicalFontTestCanvas extends JComponent{
        Font[] font = new Font[5];
        LogicalFontTestCanvas(){
            font[0] = new Font("Serif",Font.PLAIN,20);
            font[1] = new Font("SansSerif",Font.PLAIN,20);
            font[2] = new Font("Monospaced",Font.PLAIN,20);
            font[3] = new Font("Dialog",Font.PLAIN,20);
            font[4] = new Font("DialogInput",Font.PLAIN,20);

        }
        @Override
        public void paint(Graphics g){
            for (int i = 0; i< font.length; i++){
                g.setFont(font[i]);
                g.drawString("ABCDEFGHIJKLMNOPQRSTUVWXYZ",10,50+20*i);
            }
        }
    }
    public static void main(String[] args){
        new LogicalFontEx();
    }

}
