package ex.array.one;
import ex.figure.Circle;

public class CircleArrayTest2 {
    //    static void initArray(Circle cs[]){
//        for(int i=0; i<cs.length; i++)
//        cs[i] = new Circle();
//    }
    static Circle[] initArray(int n) {
        Circle[] cs = new Circle[n];
        for (int i = 0; i < cs.length; i++)
            cs[i] = new Circle();
        return cs;
    }
        public static void main (String[]args){
            Circle circles[] = initArray(3);
            for (Circle c : circles) {
                System.out.println(c.getRadius());
            }
        }
    }
