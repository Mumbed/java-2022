package hw.account;

public class CheckingAccount extends Account {
    public CheckingAccount(String aN, String nm, int bal, String cN) {
        super(aN, nm, bal);
        this.cardNo = cN;
    }
    String cardNo;

    public int pay(String cardNo, int amount){
        if(cardNo == accountNo){
            withdraw(amount);
        }
        return balance;
    }
}
