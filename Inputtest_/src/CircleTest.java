public class CircleTest {
    public static void main(String[] args){
        Circle c1;
        c1 = new Circle();
        c1.radius = 1;
        double area = c1.getArea();

    }
}

class Circle {
    double radius;

    double getcircumference() {
        return 2 * 3.14159265 * radius;
    }

    double getArea() {
        return radius *radius *3.14159265;
    }
}