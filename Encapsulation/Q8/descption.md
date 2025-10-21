設計一個簡單的「庫存管理系統」，能夠：
1 新增商品到庫存 (addProduct)
2 移除商品 (removeProduct)
3 檢查哪些商品數量過低 (checkLowInventory) (小於10)
此系統透過 Product 類別表示單一商品 (名稱 + 數量)，再由 Inventory 類別管理多個商品。

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
    inventory.removeProduct(product3);
    System.out.println( "=== Checking low inventory again ===" ); 
    inventory.checkLowInventory();
  }
}

輸出：
=== Adding products to inventory ===
=== Checking low inventory ===
Apple is low in stock: 5
Orange is low in stock: 2
=== Removing Orange ===
=== Checking low inventory again ===
Apple is low in stock: 5

提示：
1. 集合類別 (ArrayList): Inventory 透過 ArrayList<Product> 動態管理多個商品。
2. 物件操作 (物件作為方法參數): addProduct(product) 與 removeProduct(product) 展現了物件參數傳遞。