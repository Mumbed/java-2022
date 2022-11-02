package exam.Pakage;

public class Circle {
    double radius;
    static final double PI = 3.14159265;
    void setRadius(double radius) {
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }

    double getArea() {
        return PI * radius * radius;
    }
}