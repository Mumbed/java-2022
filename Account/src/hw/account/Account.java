package hw.account;

public class Account {
    public Account(String aN, String nm, int bal){
        this.accountNo = aN;
        this.name = nm;
        this.balance = bal;
        //check();
    }
    String accountNo;
    String name;
    int balance;
    public void deposit(int amount){
        this.balance += amount;
    }
    public int withdraw(int amount){
        balance -= amount;
        if(balance < 0) {
            balance = 0;
            return 0;
        }
        else
            return balance;
    }
    public void check(){
        System.out.println("잔액 = " +balance);
    }
}
