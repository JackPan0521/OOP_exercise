package Q2;

public class Book {
    protected String title, author;
    protected double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
