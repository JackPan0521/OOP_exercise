package Q3;

public class ConfigTest {
public static void main(String[] args) {
ConfigManager c1 = ConfigManager.getInstance();
ConfigManager c2 = ConfigManager.getInstance();

        System.out.println("c1 hashCode=" + c1.hashCode());
        System.out.println("c2 hashCode=" + c2.hashCode());
        System.out.println("Same instance? " + (c1 == c2));
    }

}