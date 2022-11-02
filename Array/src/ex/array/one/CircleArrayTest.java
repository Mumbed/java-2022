package ex.array.one;

import ex.figure.Circle;

public class CircleArrayTest {
    public static void main(String[] args){
        Circle[] circles = new Circle[5];
        circles[0] = new Circle();
        circles[1] = new Circle(2);
        circles[2] = new Circle(3);
        circles[3] = new Circle(4);
        circles[4] = new Circle(5);
        for(int i = 0; i < circles.length; i++){
            System.out.println(circles[i].getRadius());
        }
        String arr[] = {"홍길동", "일지매","이지매"};
        for (String s : arr){
            System.out.println(s);
        }
        for(Circle a :circles){
            System.out.println(a.getRadius());
        }
    }
}
