package Q5;

class Train extends Transport {
    protected boolean isHighSpeed;

    public Train(String start, String end, double distance, boolean isHighSpeed){
        super(start, end, distance);
        this.isHighSpeed = isHighSpeed;
    }

    public double getFare(){
        if(isHighSpeed){
            return distance * 8 * 1.2;
        }else{
            return distance * 8;
        }
    }

    @Override
    public String toString(){
        return String.format("Train fare: %.1f",getFare());
    }
}
