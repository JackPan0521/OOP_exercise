package Q6;

class Ticket {
    protected double price;
    protected String id;

    public Ticket(String id, double price){
        this.id = id;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return String.format("Normal Ticket %s: %.1f", id, getPrice());
    }
}
