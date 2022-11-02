//package gooselgame;
//
//public class Child {
//    private int goosel;
//    public Child(int goosel){
//        this.goosel = goosel;
//    }
//    void get_goosle(Child c, int cgoosel){
//        int get_goosle = c.lose_goosle(cgoosel);
//        goosel += get_goosle;
//    }
//    int lose_goosle(int lgoosel){
//        if(goosel < lgoosel){
//            int g = goosel;
//            goosel = 0;
//            return g;
//        }
//            goosel -= lgoosel;
//            return lgoosel;
//    }
//    void print_goosel(){
//        System.out.println("구슬의 개수 = " + String.format("%2d",goosel) +"개");
//    }
//
//}
package gooselgame;
public class Child {
    int goosel;

    public Child(int goosel) {
        this.goosel = goosel;
    }

    void get_goosle(Child c, int g) {
        int get_goosle = c.loose_goosel(g);
        goosel += get_goosle;

    }

    int loose_goosel(int lg) {
        if (this.goosel  < lg) {
            goosel = 0;
            return goosel;
        } else {
            goosel -= lg;
            return lg;
        }
    }

    void print_goosel() {
        System.out.println(goosel);
    }
}


