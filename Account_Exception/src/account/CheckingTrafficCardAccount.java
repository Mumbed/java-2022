package account;

public class CheckingTrafficCardAccount extends CheckingAccount {

    public CheckingTrafficCardAccount(String aN, String nm, int bal,String cN, boolean hT) {
        super(aN, nm, bal,cN);
        this.hasTrafficCard = hT;
    }
    boolean hasTrafficCard;
    public int payTrafficCard(String cdNo, int amount){
        if(cdNo == cardNo && hasTrafficCard){
            balance -= amount;
            if(balance < 0){
                balance = 0;
            }
            return balance;
        }
        else
            return balance;
    }
}
