
public class Circle {
    private double radius;
    static final double PI = 3.14159265;

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getCIrcumference() { return 2 * PI * radius; }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return PI * radius * radius;
    }

    static double getPI() { return PI; }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){
        this(1);
    }
}