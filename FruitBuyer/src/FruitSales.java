public class FruitSales {
    public static void main(String[] args){
        FruitSeller seller = new FruitSeller(20,0);
        FruitBuyer me = new FruitBuyer(10000,0);

        //int n = seller.saleApple(2000);
        me.BuyApple(seller,2000);

        seller.showResult();
        me.showResult();

    }
}
