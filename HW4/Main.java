package HW4;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // 建立第一部電影
    Movie movie1 = new Movie("Inception", "Christopher Nolan",
      new ArrayList(Arrays.asList("Leonardo DiCaprio", "Joseph Gordon-Levitt")));

    // 建立評論
    Review review1 = new Review("Amazing plot!", "Alice", 4.8);
    Review review2 = new Review("Mind-bending visuals.", "Bob", 4.5);
    Review review3 = new Review("A bit confusing at times.", "Charlie", 3.9);
    Review review4 = new Review("Great performances.", "Diana", 4.6);
    Review review5 = new Review("Too long but good.", "Eve", 4.0);

    // 對 movie1 加入評論
    movie1.addReview(review1);
    movie1.addReview(review2);
    movie1.addReview(review3);
    movie1.addReview(review4);

    // 建立第二部電影
    Movie movie2 = new Movie("Interstellar", "Christopher Nolan",
      new ArrayList(Arrays.asList("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain")));

    // 輸出第一部電影評論
    System.out.println("Reviews for: " + movie1.getTitle());
    for (Review review: movie1.getReviews()) {
      System.out.println(review.getReviewText() + " - by " + review.getReviewerName() + " (Rating: " + review.getRating() + ")");
    }

    // 對 movie2 加入評論
    movie2.addReview(review1);
    movie2.addReview(review4);
    movie2.addReview(review5);

    // 輸出第二部電影評論
    System.out.println("\nReviews for: " + movie2.getTitle());
    for (Review review: movie2.getReviews()) {
      System.out.println(review.getReviewText() + " - by " + review.getReviewerName() + " (Rating: " + review.getRating() + ")");
    }
  }
}
