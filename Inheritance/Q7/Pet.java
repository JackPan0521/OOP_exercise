package Q7;

class Pet {
    protected String name;
    protected double baseFee;

    public Pet(String name, double baseFee){
        this.name = name;
        this.baseFee = baseFee;
    }

    public double getFee(){
        return baseFee;
    }
}
