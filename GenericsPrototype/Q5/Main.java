package GenericsPrototype.Q5;

public class Main {
    public static void main(String[] args) {
        try {
            Sword baseSword = Sword.getPrototype("Iron Sword", 30);

            Sword s1 = (Sword) baseSword.copy();
            s1.setType("Player Sword");

            Sword s2 = (Sword) baseSword.copy();
            s2.setType("Enemy Sword");

            s1.show();
            s2.show();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}