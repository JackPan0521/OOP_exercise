package Q4;

public class Main {
    public static void main(String[] args) {
        Character w = new Warrior("Thor", 100, 20);
        Character m = new Mage("Merlin", 80, 25, 30);
        Character a = new Archer("Robin", 90, 18);

        w.attack(m);   // 戰士攻擊法師
        m.attack(a);   // 法師攻擊弓箭手
        a.attack(w);   // 弓箭手攻擊戰士
    }
}
