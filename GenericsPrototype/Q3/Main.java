package GenericsPrototype.Q3;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get());
    }
}
