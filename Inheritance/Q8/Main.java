package Q8;

public class Main {
public static void main(String[] args) {
Person s = new Student("Alice", 20, "CS", "S12345");
Person st = new Staff("Bob", 35, "Administrator", 50000);
Person p = new Professor("Carol", 45, "Professor", 80000, 20000);

        System.out.println(s);
        System.out.println(st);
        System.out.println(p);
    }

}