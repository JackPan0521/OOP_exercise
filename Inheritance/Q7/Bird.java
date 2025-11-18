package Q7;

class Bird extends Pet {
    protected boolean isBigBird;

    public Bird(String name, double baseFee, boolean isBigBird){
        super(name, baseFee);
        this.isBigBird = isBigBird;
    }

    @Override
    public double getFee(){
        if(isBigBird){
            return baseFee + 500;
        }else{
            return baseFee;
        }
    }

    @Override
    public String toString(){
        return String.format("Bird %s total fee: %.1f", name, getFee());
    }
}
