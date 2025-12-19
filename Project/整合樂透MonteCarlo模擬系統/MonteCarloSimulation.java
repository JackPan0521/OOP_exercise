package Project.整合樂透MonteCarlo模擬系統;

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
            report.record(sample);
        }
        report.printReport();
    }
}
