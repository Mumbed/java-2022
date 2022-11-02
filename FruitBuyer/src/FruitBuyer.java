public class FruitBuyer {
    private int money;
    private int numofApple;

    FruitBuyer(int money, int numofApple) {
        this.money = money;
        this.numofApple = numofApple;
    }
    void BuyApple(FruitSeller s,int money){
        int n = s.saleApple(money);
        this.money -= money;
        this.numofApple += n;
    }

    public void showResult(){
        System.out.println("구입액 개수: " + numofApple + "개");
        System.out.println("소지 금액: " + money+ "원");
    }
}
