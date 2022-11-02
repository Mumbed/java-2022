public class Point {
    private int x,y;
    Point(int X,int Y) {
        this.x = X;
        this.y = Y;
    }
    Point(){
    }

    void setxy(int x,int y) {
        this.x = x;
        this.y = y;
    }
    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
    void show() {
        System.out.println("(" + x + ")," + "(" + y + ")");
    }

}