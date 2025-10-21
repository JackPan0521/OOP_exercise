package Encapsulation.Q11;
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