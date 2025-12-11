package Interfave.Q18;

public class Button {
    private String text;
    private OnClickListener listener;

    public Button(String text) {
        this.text = text;
    }

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        System.out.println("Button " + text + " Clicked");
        if (listener != null) {
            listener.onClick(); // callback
        }
    }
}
