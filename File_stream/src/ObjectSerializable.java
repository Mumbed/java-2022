import java.awt.*;
import java.io.*;
class Circle implements Serializable {
    Point p;
    double r;
    // transient double r;
    Circle(int x, int y, double r) {
        this.p = new Point(x, y);
        this.r = r;
    }

    void showInfo() {
        System.out.printf("(%d, %d), ", p.x, p.y);
        System.out.println("r = " + r);
    }
}
public class ObjectSerializable {
    static void save() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("circle.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(new Circle(1, 1, 3));
            oos.writeObject(new Circle(2, 2, 5));
            oos.writeObject(new String("String implements Serializable"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
                if (fos != null) fos.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
    static void load() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("circle.dat");
            ois = new ObjectInputStream(fis);
            Circle c1 = (Circle) ois.readObject();
            Circle c2 = (Circle) ois.readObject();
            String s = (String) ois.readObject();
            c1.showInfo();
            c2.showInfo();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (ois != null) ois.close();
                if (fis != null) fis.close();
            }
            catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
        public static void main(String[] args){
        save();
        load();
        }
}
