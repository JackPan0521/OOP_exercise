package SOLID原則.Q4;

public class Rectangle implements Shape {
    private int heigth,width;

    public Rectangle(int heigth,int width){
        this.heigth = heigth;
        this.width = width;
    }

    public int getArea(){
        return heigth*width;
    }
}
