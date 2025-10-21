public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public double getArea() { 
        return width * height;
    }
}