package Q9;

class Dessert extends Item{
    protected int calorie;

    public Dessert(String name, double price, int calorie){
        super(name, price);
        this.calorie = calorie;
    }

    public double getFinalPrice(){
        if(calorie > 500){
            return price * 0.9;
        }else{
            return price;
        }
        
    }

    @Override
    public String toString(){
        return String.format("Dessert %s: %.1f", name, getFinalPrice());
    }
}
