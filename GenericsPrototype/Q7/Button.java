package GenericsPrototype.Q7;

public class Button implements Cloneable{
    private String text;
    private String color;
    private int width;
    private int height;

    public static Button prototype;

    public static Button getPrototype(String text, String color, int width, int height){
        if(prototype==null)
            return new Button(text, color, width, height);
        return prototype;
    } 

    private Button(String text, String color, int width, int height){
        this.color = color;
        this.text = text;
        this.height = height;
        this.width = width;
    }

    public void setText(String text){
        this.text = text;
    }

    public void show(){
        System.out.printf("%s %s %dx%d\r\n",text,color,width,height);
    }
    
    public Button copy() throws CloneNotSupportedException{
        try {
            return (Button) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Button should be cloneable", e);
        }
    }
}
