package GenericsPrototype.Q7;

public class Main {
    public static void main(String[] args) {
        try {
            Button prototype = Button.getPrototype("Default", "Blue", 120, 40);

            Button save = prototype.copy();
            save.setText("Save");

            Button cancel = prototype.copy();
            cancel.setText("Cancel");

            save.show();
            cancel.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}