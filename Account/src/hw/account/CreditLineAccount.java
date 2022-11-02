package hw.account;

public class CreditLineAccount extends Account {

    int creditLine;
    public CreditLineAccount(String aN, String nm, int bal, int CL) {
        super(aN, nm, bal);
        this.creditLine = CL;
    }
    @Override
    public int withdraw(int amount) {
        balance -= amount;
        if(balance < 0 && (balance * -1) > creditLine) {
            balance = 0;
            return balance;
        }
        else
            return balance;
    }
}
