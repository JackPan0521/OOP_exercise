package Q9;

class Meal extends Item {
    protected String size;

    public Meal(String name, double price, String size){
        super(name, price);
        this.size = size;
    }
    
    public double getFinalPrice(){
        switch (size) {
            case "small":
                return price;
            case "medium":
                return price + 30;
            case "large":
                return price + 50;
            default:
                return price;
        }
    }

    @Override
    public String toString(){
        return String.format("Meal %s (%s): %.1f", name, size, getFinalPrice());
    }
}
