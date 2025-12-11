package Interfave.Q19;

public class Product implements Comparable<Product> {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {

        if (this.price != other.price) {
            return other.price - this.price;
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " : " + price;
    }
}
