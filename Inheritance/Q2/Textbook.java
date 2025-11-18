package Q2;

public class Textbook extends Book {
    protected int edition;

    public Textbook(String title, String author, double price, int edition){
        super(title, author, price);
        this.edition = edition;
    }

    public double getPrice(){
        switch(edition){
        case 1:
            return price;
        case 2:
            return price * 0.95;
        case 3:
            return price * 0.9;
        default:
            return price;
        }
    }

    @Override
    public String toString(){
        return String.format("Textbook: %s (%s) - Price: %.1f",title ,author, getPrice());
    }
}
