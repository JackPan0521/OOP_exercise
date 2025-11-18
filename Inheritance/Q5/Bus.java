package Q5;

class Bus extends Transport{
    public Bus(String start, String end, double distance){
        super(start, end, distance);
    }

    public double getFare(){
        if(distance <= 20){
            return distance * 10;
        }else{
            return distance * 10 * 0.9;
        }
    }

    @Override
    public String toString(){
        return String.format("Bus fare: %.1f",getFare());
    }
}
