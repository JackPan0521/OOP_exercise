package SOLID原則.Q8;

class Main {
   public static void main(String[] args) {
	 Drawable p = new Circle();
	 p.draw();

	 p = new Square();
	 p.draw();

	 DrawingTool dt = new DrawingTool();
	 dt.draw(new Circle());
	 dt.draw(new Square());
    }
}
