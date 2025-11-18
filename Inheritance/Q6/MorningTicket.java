package Q6;

class MorningTicket extends Ticket{
    public MorningTicket(String id, double price){
        super(id, price);
    }

    @Override
    public double getPrice(){
        return price * 0.7;
    }

    @Override
    public String toString(){
        return String.format("Morning Ticket %s: %.1f", id, getPrice());
    }
}
