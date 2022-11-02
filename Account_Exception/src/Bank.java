
import account.*;
public class Bank {
    public static void main(String[] args) throws MalformedData,BalanceOutOfBoundsException {
        Account [] Bank = new Account[5];
        Bank[0] = new Account("hansung", "ys", 100000);
        Bank[1] = new CheckingAccount("hansung", "ys",100000, "hansung");
        Bank[2] = new CheckingTrafficCardAccount("hansung", "ys",100000, "hansung", true);
        Bank[3] = new BonusPointAccount("hansung", "ys", 100000);
        Bank[4] = new CreditLineAccount("hansung", "ys", 100000, 200000);

        Bank[0].deposit(50000);
        Bank[0].withdraw(500000);
        Bank[0].check();

        if(Bank[1] instanceof Account) {
            ((CheckingAccount)Bank[1]).pay("hansung", 500000);
            Bank[1].check();
        }

        if(Bank[2] instanceof Account) {
            ((CheckingTrafficCardAccount)Bank[2]).pay("hansung", 5000);
            ((CheckingTrafficCardAccount)Bank[2]).payTrafficCard("hansung", 80000);
            Bank[2].check();
        }

        Bank[3].deposit(500000);
        Bank[3].check();

        Bank[4].withdraw(300000);
        Bank[4].check();
    }
}
