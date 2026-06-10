package Bridge.Q4;

public class Star extends Shape{
    public Star(ShapeDrawer sd){
        this.sd = sd;
    }
    public void display(){
        System.out.println("我是Star");
    }
}
