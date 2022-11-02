package gooselgame;

public class Goosel_simul {
    public static void main(String[] args) {
        Child c1 = new Child(15);
        Child c2 = new Child(9);
        c1.print_goosel();
        c2.print_goosel();
        c1.get_goosle(c2,2);
        c2.get_goosle(c1,7);
        c1.print_goosel();
        c2.print_goosel();
    }
}