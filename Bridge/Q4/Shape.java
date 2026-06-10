package Bridge.Q4;

public abstract class Shape implements ShapeDrawer{
    protected ShapeDrawer sd;
    public abstract void display();
    public void drawShape(){sd.drawShape();}
}
