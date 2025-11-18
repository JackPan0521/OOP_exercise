package Q2;

public class Comic extends Book {
    protected int pageCount;

    public Comic(String title, String author, double price, int pageCount){
        super(title, author, price);
        this.pageCount = pageCount;
    }

    public double getPrice(){
        return pageCount>200 ? price*0.85:price;
    }

    @Override
    public String toString(){
        return String.format("Comic: %s (%s) - Price: %.1f", title, author, getPrice());
    }
}