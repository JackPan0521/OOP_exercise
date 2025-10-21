設計一個 Restaurant 系統，可以管理餐廳菜單項目，並允許顧客對餐點進行評分。系統應支援以下功能：
1 新增菜單項目（名稱 + 價格）。
2 刪除菜單項目。
3 顯示目前菜單。
4 針對餐點進行多次評分，並計算每道菜的平均評分。
5 計算餐廳整體平均評分。

public class Main {
  public static void main(String[] args) {
    Restaurant restaurant = new Restaurant();
    restaurant.addItem("Pasta", 220.0);
    restaurant.addItem("Pizza", 280.0);
    restaurant.addItem("Salad", 150.0);

    System.out.println("=== Menu ===");
    restaurant.displayMenu();

    // 顧客評分
    restaurant.addRating("Pasta", 4);
    restaurant.addRating("Pasta", 5);
    restaurant.addRating("Pizza", 3);
    restaurant.addRating("Pizza", 4);
    restaurant.addRating("Salad", 5);

    double averageRating = restaurant.getAverageRating("Pasta");
    System.out.println("Average rating for Pasta: " + averageRating);

    averageRating = restaurant.getAverageRating("Pizza");
    System.out.println("Average rating for Pizza: " + averageRating);

    averageRating = restaurant.getAverageRating("Salad");
    System.out.println("Average rating for Salad: " + averageRating);

    System.out.println("Overall restaurant rating: " + restaurant.calculateAverageRating());

    System.out.println("\n=== Remove Pizza ===");
    restaurant.removeItem("Pizza");

    System.out.println("=== Updated Menu ===");
    restaurant.displayMenu();
  }
}

輸出：
=== Menu ===
Pasta - 220.0
Pizza - 280.0
Salad - 150.0
Average rating for Pasta: 4.5
Average rating for Pizza: 3.5
Average rating for Salad: 5.0
Overall restaurant rating: 10.666666666666666

=== Remove Pizza ===
=== Updated Menu ===
Pasta - 220.0
Salad - 150.0

提示：
ArrayList 與平行結構:
1. 使用 ArrayList<String> 、ArrayList<Double> 、ArrayList<Integer> 管理多個屬性（餐點名稱、價格、評分、次數）。
2. 學生要理解「相同 index 的資料互相對應」的概念。