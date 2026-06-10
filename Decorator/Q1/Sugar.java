package Decorator.Q1;

public class Sugar implements Beverage{
    private Beverage beverage;
    public Sugar(Beverage beverage){this.beverage = beverage;}
    public String getDescription(){return beverage.getDescription()+", Suger";}
    public double cost(){return beverage.cost()+1.0;}
}
