package Q7;

class Cat extends Pet {
    public Cat(String name, double baseFee){
        super(name, baseFee);
    }

    @Override
    public double getFee(){
        return baseFee + 200;
    }

    @Override
    public String toString(){
        return String.format("Cat %s total fee: %.1f", name, getFee());
    }
}
