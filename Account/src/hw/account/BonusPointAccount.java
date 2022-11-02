package hw.account;

public class BonusPointAccount extends Account {


    public BonusPointAccount(String aN, String nm, int bal) {
        super(aN, nm, bal);
    }
    int bonusPoint;

    @Override
    public void deposit(int amount){
        balance += amount +(amount / 1000);
        bonusPoint += (amount / 1000);
    }
    @Override
    public void check(){
        System.out.println("잔액 = " +balance + " 포인트 =" + bonusPoint);
    }
}

