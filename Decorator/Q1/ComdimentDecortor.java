package Decorator.Q1;

public abstract class ComdimentDecortor implements Beverage{
    private double cost;
    private String des;
    public String getDescription(){return des;}
    public double cost(){return cost;}
}
