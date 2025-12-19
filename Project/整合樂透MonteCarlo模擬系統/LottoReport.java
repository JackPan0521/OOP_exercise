package Project.整合樂透MonteCarlo模擬系統;

public class LottoReport extends BaseReport {
    private long hit3Count = 0;
    private long total;
    private LottoEvent event = new LottoEvent();

    public LottoReport(long total) {
        this.total = total;
    }

    @Override
    public void record(BaseSample s) {
        if (event.checkEvent(s)) {
            hit3Count++;
        }
    }

    @Override
    public void printReport() {
        double prob = (double) hit3Count / total;
        System.out.println("模擬點數 N = " + total);
        System.out.printf("估算得到的機率 ≈ %.20f%n", prob);
    }
}
