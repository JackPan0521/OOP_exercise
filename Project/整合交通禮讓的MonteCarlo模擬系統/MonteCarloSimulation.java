package Project.整合交通禮讓的MonteCarlo模擬系統;

public abstract class MonteCarloSimulation {
    protected BaseSampling sampling;
    protected BaseReport report;

    public MonteCarloSimulation(BaseSampling sampling, BaseReport report) {
        this.sampling = sampling;
        this.report = report;
    }

    public void runSimulation(long numEncounters) {
        for (long i = 0; i < numEncounters; i++) {
            BaseSample sample = sampling.nextSample();
            if (sample == null) break; // 無人可選
            report.record(sample);
        }
        report.printReport();
    }
}

