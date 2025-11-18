package Q9;

class Drink extends Item {
    protected boolean withPearl;

    public Drink(String name, double price, boolean withPearl){
        super(name, price);
        this.withPearl = withPearl;
    }

    public double getFinalPrice(){
        return withPearl?price+10:price;
    }

    @Override
    public String toString(){
        if(withPearl){
            return String.format("Drink %s (with pearl): %.1f", name, getFinalPrice());
        }else{
            return String.format("Drink %s: %.1f", name, getFinalPrice());
        }
        
    }
}
