import java.util.*;

public class pro {
    public static void main(String[] args) {
        String[] str = {"가위","바위", "보"};
        System.out.println(Arrays.toString(str));

        for(int i=0;i<10;i++){
           int tmp =(int)(Math.random()*3);
            System.out.println(str[tmp]);
        }
        }
    }
