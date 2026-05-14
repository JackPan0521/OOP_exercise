package GenericsPrototype.Q14;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> baseSkills = new ArrayList<>();
            baseSkills.add("Slash");

            Hero prototype = Hero.getPrototype("Default Hero", baseSkills);

            Hero h1 = prototype.clone();
            h1.setName("Hero A");
            h1.addSkill("Fire");

            Hero h2 = prototype.clone();
            h2.setName("Hero B");

            h1.show();
            h2.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
