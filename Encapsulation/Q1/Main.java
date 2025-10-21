package Encapsulation.Q1;

public class Main {
  public static void main(String[] args) {
    int r = 5 ;
    Circle circle = new Circle(r);
    System.out.println( "半徑 = " + r);
    System.out.println( "面積 = " + circle.getArea());
    System.out.println( "周長 = " + circle.getCircumference());
    r = 10 ;
    circle.setRadius(r);
    System.out.println( "修改後半徑 = " + r);
    System.out.println( "修改後面積 = " + circle.getArea());
    System.out.println( "修改後周長 = " + circle.getCircumference());
  }
}