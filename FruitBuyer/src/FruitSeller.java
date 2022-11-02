public class FruitSeller {
    static  final int APPLE_UNICOST= 1000;
    private int numOfApple = 20;
    private int money =0;

    public FruitSeller(int numOfApple, int money) {
        this.numOfApple = numOfApple;
        this.money = money;
    }
    public int saleApple(int m){
        int num = m/APPLE_UNICOST;
        numOfApple -= num;
        money += m;
        return num;
    }
    public void showResult(){
        System.out.println("남은 사과 개수: " + numOfApple + "개");
        System.out.println("오늘 수익: " + money+ "원");
    }
}