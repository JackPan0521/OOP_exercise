package Q1;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Sampling {
    private Random rand = new Random();

    public Sample genSample(){
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 6) {
            numbers.add(rand.nextInt(49) + 1);
        }

        return new Sample(numbers);
    }
}

