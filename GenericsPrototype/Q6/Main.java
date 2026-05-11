package GenericsPrototype.Q6;

public class Main {
    public static void main(String[] args) {
        try {
            Student prototype = new Student("Default", "Class A", 1);

            Student s1 = prototype.cloneStudent();
            s1.setName("Amy");

            Student s2 = prototype.cloneStudent();
            s2.setName("Bob");

            s1.show();
            s2.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}