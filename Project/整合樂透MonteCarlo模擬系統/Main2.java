package Project.整合樂透MonteCarlo模擬系統;

public class Main2 {
    public static void main(String[] args) {
        BaseSampling sampleGenerator = new LottoSampling( );
        long N = 1_000_000;
        BaseReport report = new LottoReport(N);
        
        MonteCarloSimulation sim = new LottoSimulation(sampleGenerator, report);
        sim.runSimulation(N);
        
    }
}