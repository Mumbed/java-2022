package ex.lotto;
import java.util.Random;


public class Lotto {
    int[] lottoNumber = new int[6];
    boolean inValid;
    public Lotto(int a, int b, int c, int d, int e, int f) {
        lottoNumber = new int[]{a, b, c, d, e, f};
        verify();
    }
    public Lotto() {
        Generator();
        verify();
    }
    boolean verify() {
        for (int i = 0; i < lottoNumber.length; i++) {
            if (lottoNumber[i] < 0 || lottoNumber[i] > 45) {
                inValid = false;
                return inValid;
            } else
                inValid = true;
        }
        if (inValid == true) {
            int r = 0;
            for (int i = 0; i < 6; i++) {
                for (int j = i + 1; j < 6; j++) {
                    if (lottoNumber[i] == lottoNumber[j])
                        r++;
                }
            }
            if (r >= 1)
                inValid = false;
            else
                inValid = true;
            return inValid;
        }
        else
                return false;
}
    public void show(){
        if(inValid ==  true) {
            for(int i = 0; i < 6; i++) {
                if (i == 5){
                    System.out.println(String.format("%2d",lottoNumber[i]));
                }
                else
                    System.out.print(String.format("%2d",lottoNumber[i]) + ", ");
            }
            System.out.println();
        }
        else
            System.out.println("번호 오류");
    }
    int [] getNumbers(){
        if(inValid == true)
            return lottoNumber;
        else
            return null;
    }
    void Generator(){
        Random ge = new Random();
        int [] rannumber = new int[6];
            while(true){
                for(int i = 0; i < 6; i++) {
                    int rannum = (ge.nextInt(45)+1);
                    lottoNumber[i] = rannum;
                }
                int r = 0; // 겹치는 수가 있는지 판별해줌
                for (int i = 0; i < 6; i++) {
                    for (int j = i+1; j < 6; j++) {
                        if(lottoNumber[i] == lottoNumber[j])
                            r++;
                        }
                    }
                    if (r >= 1)
                        continue;
                    else
                        break;
            }
        }
}
