package Project.整合樂透MonteCarlo模擬系統;

public class LottoEvent extends BaseEvent {

    @Override
    public boolean checkEvent(BaseSample s) {
        LottoSample ls = (LottoSample) s;
        int match = 0;
        for (Integer n : ls.playerNumbers) {
            if (ls.drawNumbers.contains(n)) {
                match++;
            }
        }
        return match == 3;
    }
}
