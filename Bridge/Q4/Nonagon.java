package Bridge.Q4;

public class Nonagon extends Shape{
    public Nonagon(ShapeDrawer sd){
        this.sd = sd;
    }
    public void display(){
        System.out.println("我是Nonagon");
    }
}
