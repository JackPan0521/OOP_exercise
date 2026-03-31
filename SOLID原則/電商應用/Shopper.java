package SOLID原則.電商應用;

class Shopper implements IObserver{
    private String shopName;

    public Shopper(String shopName){
        this.shopName = shopName;
    }

    @Override
    public void update(int price){
        System.out.println(this.shopName + " received update from PriceTracker. New Watermelon price:" + price);
    }

    public String getShopName(){
        return shopName;
    }
}
