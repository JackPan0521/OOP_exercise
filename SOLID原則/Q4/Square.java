package SOLID原則.Q4;

public class Square implements Shape{
    private int sideLength;

    public Square(int sideLength){
        this.sideLength = sideLength;
    }
    public int getArea(){
        return sideLength*sideLength;
    }
}
