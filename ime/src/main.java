import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
public class main {
    static int getInteger(){
        Scanner s = new Scanner(System.in);
        int n;
        Scanner y = new Scanner(System.in);
        try{
            n = s.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("다시 입력");
            n = y.nextInt();
            return n;
        }
        return n;
    }
    public static void main(String[] args){
        System.out.println("나이 입력하쇼");

        int age = getInteger();
        System.out.println("나이:" + age + "세");

    }
}
