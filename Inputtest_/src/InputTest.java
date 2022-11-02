import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        int i;
        double j;
        Scanner s = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        i = s.nextInt();
        System.out.print("실수를 입력하세요: ");
        j = s.nextDouble();

        System.out.println();
        System.out.println("입력한 정수는" + i + "입니다.");
        System.out.println("입력한 실수는" + j + "입니다.");

    }
}