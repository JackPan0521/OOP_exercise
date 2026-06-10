package Decorator.Q1;

public class Milk implements Beverage{
    private Beverage beverage;
    public Milk(Beverage beverage){this.beverage = beverage;}
    public String getDescription(){return beverage.getDescription()+", Milk";}
    public double cost(){return beverage.cost()+1.0;}
}
