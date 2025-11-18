import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Sampling {
    private final Random random;

    public Sampling() {
        this.random = new Random();
    }

    public Sampling(long seed) {
        this.random = new Random(seed);
    }

    // 產生一個 Sample（6 個不重複數字，範圍 1..49）
    public Sample drawSample() {
        Set<Integer> set = new HashSet<>(6);
        while (set.size() < 6) {
            int n = random.nextInt(49) + 1; // 1..49
            set.add(n);
        }
        return new Sample(set);
    }
}
