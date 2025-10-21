package HW4;
import java.util.ArrayList;

public class Movie {
    private String title;
    private String director;
    private ArrayList<String> cast;
    private ArrayList<Review> reviews;

    public Movie(String title, String director, ArrayList<String> cast) {
        this.title = title;
        this.director = director;
        this.cast = cast;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }
}