package Encapsulation.Q8;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void checkLowInventory(){
        for(Product product:products){
            if(product.getAmount() < 10)
                System.out.println(product.getName() + " is low in stock: " + product.getAmount());
        }
    }
}