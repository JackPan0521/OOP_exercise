package GenericsPrototype.Q2;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(5); 
        numbers.add(20);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
