package Q2;

public class Novel extends Book {
    protected boolean bestseller;

    public Novel(String title, String author, double price, boolean bestseller) {
        super(title, author, price);
        this.bestseller = bestseller;
    }

    public double getPrice() {
        return bestseller ? price * 0.9 : price;
    }

    @Override
    public String toString() {
        return String.format("Novel: %s (%s) - Price: %.1f",title,author,getPrice());
    }
}