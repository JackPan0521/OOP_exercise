package Encapsulation.Q8;

public class Main {
 public static void main(String[] args) {
    Inventory inventory = new Inventory();
    Product product1 = new Product( "Apple" , 5 );
    Product product2 = new Product( "Orange" , 2 );
    Product product3 = new Product( "Banana" , 25 );
    System.out.println( "=== Adding products to inventory ===" );
    inventory.addProduct(product1);
    inventory.addProduct(product2);
    inventory.addProduct(product3);
    System.out.println( "=== Checking low inventory ===" );
    inventory.checkLowInventory();
    System.out.println("=== Removing Orange ===" );
    inventory.removeProduct(product2);
    System.out.println( "=== Checking low inventory again ===" ); 
    inventory.checkLowInventory();
  }
}