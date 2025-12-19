package Project.整合樂透MonteCarlo模擬系統;

import java.util.Set;

public class LottoSample extends BaseSample {
    Set<Integer> drawNumbers;
    Set<Integer> playerNumbers;

    public LottoSample(Set<Integer> draw, Set<Integer> player) {
        this.drawNumbers = draw;
        this.playerNumbers = player;
    }
}
