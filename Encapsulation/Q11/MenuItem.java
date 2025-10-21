package Encapsulation.Q11;
import java.util.ArrayList;

public class MenuItem {
    private String name;
    private double price;
    private ArrayList<Integer> ratings;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.ratings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
        }
    }

    public double getAverageRating() {
        if (ratings.size() == 0) {
            return 0.0;
        }
        
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.size();
    }

    public int getRatingCount() {
        return ratings.size();
    }

    public ArrayList<Integer> getRatings() {
        return new ArrayList<>(ratings);
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MenuItem menuItem = (MenuItem) obj;
        return name.equals(menuItem.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
