package ex.hw;
import ex.lotto.*;

public class LottoSim {
    public static void main(String[] args) {
        LottoCard card1 = new LottoCard();
        LottoCard card2 = new LottoCard();
        System.out.println("자동 생성된 Lotto");
        card1.SetCard(1);
        card1.print_Card(5);
        System.out.println("수동 생성된 Lotto");
        card2.SetCard(2);
        card2.print_Card(3);

    }
}
