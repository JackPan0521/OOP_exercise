package Encapsulation.Q11;
import java.util.ArrayList;

public class Restaurant {
    private ArrayList<MenuItem> menuItems;

    public Restaurant() {
        menuItems = new ArrayList<>();
    }

    public void addItem(String name, double price) {
        MenuItem newItem = new MenuItem(name, price);
        menuItems.add(newItem);
    }

    public void removeItem(String name) {
        menuItems.removeIf(item -> item.getName().equals(name));
    }

    public void displayMenu() {
        for (MenuItem item : menuItems) {
            System.out.println(item.toString());
        }
    }

    public void addRating(String name, int rating) {
        for (MenuItem item : menuItems) {
            if (item.getName().equals(name)) {
                item.addRating(rating);
                break;
            }
        }
    }

    public double getAverageRating(String name) {
        for (MenuItem item : menuItems) {
            if (item.getName().equals(name)) {
                return item.getAverageRating();
            }
        }
        return 0.0;
    }

    public double calculateAverageRating() {
        if (menuItems.isEmpty()) {
            return 0.0;
        }

        int totalSum = 0;
        int totalCount = 0;
        
        for (MenuItem item : menuItems) {
            ArrayList<Integer> ratings = item.getRatings();
            for (int rating : ratings) {
                totalSum += rating;
                totalCount++;
            }
        }
        
        if (totalCount > 0) {
            return (double) totalSum / totalCount;
        }
        return 0.0;
    }

    // 進階方法：尋找特定菜單項目
    public MenuItem findMenuItem(String name) {
        for (MenuItem item : menuItems) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    // 進階方法：獲取所有菜單項目（防禦性複製）
    public ArrayList<MenuItem> getMenuItems() {
        return new ArrayList<>(menuItems);
    }

    // 進階方法：獲取菜單大小
    public int getMenuSize() {
        return menuItems.size();
    }

    // 進階方法：檢查菜單項目是否存在
    public boolean hasMenuItem(String name) {
        return findMenuItem(name) != null;
    }

    // 進階方法：更新菜單項目價格
    public boolean updatePrice(String name, double newPrice) {
        MenuItem item = findMenuItem(name);
        if (item != null) {
            item.setPrice(newPrice);
            return true;
        }
        return false;
    }
}
