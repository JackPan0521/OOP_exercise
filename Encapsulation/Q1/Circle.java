package Encapsulation.Q1;

public class Circle {
    private int radius;

    public Circle(){}
    public Circle(int r){
        radius = r;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2*radius*Math.PI;
    }

    public void setRadius(int r){
        radius = r;
    }

    public int getRadius(){
        return radius;
    }
}
