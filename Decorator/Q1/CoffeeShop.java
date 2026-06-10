package Decorator.Q1;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage coffee = new Sugar(new Milk(new Coffee())) ;
       
        System.out.println("Order: " + coffee.getDescription());//顯示 Order: Coffee, Milk, Sugar

        System.out.println("Total cost: $" + coffee.cost());//顯示 Total cost: $7.0
    }
}