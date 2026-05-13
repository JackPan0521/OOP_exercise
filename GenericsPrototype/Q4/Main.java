package GenericsPrototype.Q4;

public class Main {
    public static void main(String[] args) {
        try {
            Warrior prototype = Warrior.getPrototype("Default Warrior", 100, 20);

            Warrior w1 = prototype.clone();
            w1.setName("Arthur");

            Warrior w2 = prototype.clone();
            w2.setName("Leon");

            w1.show();
            w2.show();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}