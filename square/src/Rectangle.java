public class Rectangle {
    Point lt = new Point();
    Point rb = new Point();

    int  x, y;
    Rectangle(int x1,int y1,int x2,int y2) {
       lt.setxy(x1,y1);
       rb.setxy(x2,y2);
    }
    Rectangle(Point a, Point b) {
        lt = a;
        rb = b;
    }
    int getWidth() {
        return (rb.getX() -lt.getX());
    }
    int getHeight() {
        return rb.getY() -lt.getY();
    }
    int getCircumference(){
        return getWidth() *2 + getHeight() * 2;
}
    int getArea(){
        return getWidth() * getHeight();
    }
    void show(){
        System.out.println("[직사각형 " + getWidth() +"x"+getHeight()+
                ": (" + lt.getX() +", "+ lt.getY() + ")"
                +", (" + rb.getX() + ", " + rb.getY()+")]");
    }

}


