package ex.lotto;
import java.util.Scanner;

public class LottoCard {
    int mEffNum;
    Lotto [] mLotto = new Lotto[5];
    public void SetCard(int S){
        if(S == 1){
            for(int i = 0; i < mLotto.length; i++){
                mLotto[i] = new Lotto();
            }
        }
        else{
            mLotto[0] = new Lotto(1,3,8,14,23,42);
            mLotto[1] = new Lotto(10,12,13,26,36,39);
            mLotto[2] = new Lotto(11,19,22,25,33,35);
            mLotto[3] = new Lotto(5,8,9,14,23,40);
            mLotto[4] = new Lotto(2,3,15,23,39,45);
        }
    }
    public void print_Card(int C){
        for(int i = 0; i < C; i++){
            mLotto[i].show();
        }
    }
}
