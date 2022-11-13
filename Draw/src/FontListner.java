import java.awt.*;
public class FontListner {
    public static void main(String[] args){
        String[] fontList;
        GraphicsEnvironment g;
        g = GraphicsEnvironment.getLocalGraphicsEnvironment();

        fontList = g.getAvailableFontFamilyNames();
        for(int i=0; i<fontList.length; i++){
            System.out.println(fontList[i]);
        }
    }
}
