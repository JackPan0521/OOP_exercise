public class MonteCarloLotter {
    private final Sampling sampling;
    private final Event event;
    private final Sample player; // 固定玩家選號

    // 建構子：預設隨機玩家號碼與隨機來源
    public MonteCarloLotter() {
        this.sampling = new Sampling();
        this.event = new Event();
        this.player = sampling.drawSample();
    }

    // 可傳 seed 以重現結果
    public MonteCarloLotter(long seed) {
        this.sampling = new Sampling(seed);
        this.event = new Event();
        this.player = sampling.drawSample();
    }

    // 執行 N 次模擬，回傳命中比例（double）
    public double estimate(long N) {
        if (N <= 0) return 0.0;
        long hits = 0L;
        for (long i = 0; i < N; i++) {
            Sample draw = sampling.drawSample();
            if (event.checkEvent(player, draw)) {
                hits++;
            }
        }
        return (double) hits / (double) N;
    }

    // 若需查看玩家號碼
    public Sample getPlayerSample() {
        return player;
    }
}
