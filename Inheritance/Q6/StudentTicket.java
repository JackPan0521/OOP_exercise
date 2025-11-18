package Q6;

class StudentTicket extends Ticket{
    public StudentTicket(String id, double price){
        super(id, price);
    }

    @Override
    public double getPrice(){
        return price * 0.8;
    }

    @Override
    public String toString(){
        return String.format("Student Ticket %s: %.1f", id, getPrice());
    }
}
