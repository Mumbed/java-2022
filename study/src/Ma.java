import java.util.Scanner;

//import java.util.Scanner;
//public class Grade {
//    int average;
//    public Grade(int math,int science, int english){
//        average += math + science + english;
//    }
//    int average() {
//        return average/3;
//    }
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int math = s.nextInt();
//        int science = s.nextInt();
//        int average = s.nextInt();
//        Grade grade = new Grade(math, science, average);
//        System.out.println("평균은" + grade.average());
//        Scanner close;
//    }
//}
public class Ma{
    Scanner s = new Scanner(System.in);
    Day[] dy;
    public Ma(int date){
        dy = new Day[date];
        for(int i=0 ; i< date ; i++){
            dy[i] = new Day();
        }
    }
    void input(){
        //System.out.println("할일(입력:1, 보기:2. 끝내기:3");
        System.out.println("날짜(1~30)?");
        int selectday = s.nextInt();
        System.out.println("할일(빈칸없이입력)?");
        String todo = s.next();
        dy[selectday-1].set(todo);
    }
    void view(){
        int date = s.nextInt();
        System.out.println(date+"일의 할 일은 ");
        dy[date-1].show();
    }
    void finish() {
        System.out.println("프로그램을 종료합니다.");
    }
    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int menu = s.nextInt();
            if (menu == 1) {
                input();
            } else if (menu == 2) {
                view();
            } else if (menu == 3) {
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
        finish();
    }
    public static void main(String[] args){
        Ma a1 = new Ma(30);
        a1.run();
    }
}