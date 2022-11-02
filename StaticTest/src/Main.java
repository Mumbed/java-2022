public class Main {
    public static void main(String[] args) {
        System.out.println(Circle.PI);
        System.out.println(Circle.getPI());

        Circle c = new Circle();
        c.radius = 1;

        System.out.println(Circle.PI);
    }
}