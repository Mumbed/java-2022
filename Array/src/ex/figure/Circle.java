package ex.figure;

public class Circle {
    double radius;
    static final double PI = 3.14159265;
    public Circle(){
        setRadius(1);
    }
    public Circle(double radius) {
        setRadius(radius);
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    double getArea() {
        return PI * radius * radius;
    }
}