package Project.整合樂透MonteCarlo模擬系統;

import java.util.*;

public class LottoSampling extends BaseSampling {
    private Random rand = new Random();

    private Set<Integer> generateNumbers() {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 6) {
            set.add(rand.nextInt(49) + 1); // 1~49
        }
        return set;
    }

    @Override
    public BaseSample nextSample() {
        return new LottoSample(generateNumbers(), generateNumbers());
    }
}

