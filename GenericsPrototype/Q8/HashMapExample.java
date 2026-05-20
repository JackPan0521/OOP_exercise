package GenericsPrototype.Q8;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 90);
        scores.put("Charlie", 78);

        if(scores.get("David")!=null){
            System.out.println("David's score: " + scores.get("David"));
        }else{
            System.out.println("David not found.");
        }
        System.out.println("Bob's score: " + scores.get("Bob"));
    }
}
