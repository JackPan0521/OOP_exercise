package Q5;

class Taxi extends Transport {
    public Taxi(String start, String end, double distance){
        super(start, end, distance);
    }

    public double getFare(){
        if (distance <= 2) {
            return 70;
        }else{
            return 70 + (distance - 2) * 25;
        }
    }

    @Override
    public String toString(){
        return String.format("Taxi fare: %.1f",getFare());
    }
}
