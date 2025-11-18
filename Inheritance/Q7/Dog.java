package Q7;

class Dog extends Pet {
    protected double weight;
    
    public Dog(String name, double baseFee, double weight){
        super(name, baseFee);
        this.weight = weight;
    }

    @Override
    public double getFee(){
        return baseFee + weight * 10;
    }

    @Override
    public String toString(){
        return String.format("Dog %s total fee: %.1f", name, getFee());
    }
}
