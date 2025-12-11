package Interfave.Q18;

public class Main {
    public static void main(String[] args) {
        Button btn = new Button("Submit");

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Form Submitted!");
            }
        });

        btn.click();
    }
}
