package account;
import java.util.*;
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
    public void deposit(int amount) throws MalformedData{
        if(amount < 0) throw new MalformedData(); //디포짓
        this.balance += amount;
    }
    public int withdraw(int amount) throws MalformedData{
        if(amount < 0) throw new MalformedData(); //디포
        balance -= amount;

        if(balance < 0) throw new BalanceOutOfBoundsException();
        else
            return balance;
    }
    public void check(){
        System.out.println("잔액 = " +balance);
    }
    int getInteger(){
        Scanner s = new Scanner(System.in);
        while(true) {
            try{
                int su = s.nextInt();
            }
            catch(InputMismatchException e){

                int su1 = s.nextInt();
            }

        }

    }
}
