package Q6;

class VipTicket extends Ticket{
    public VipTicket(String id, double price){
        super(id, price);
    }

    @Override
    public double getPrice(){
        return price + 50;
    }

    @Override
    public String toString(){
        return String.format("VIP Ticket %s: %.1f", id, getPrice());
    }
}
