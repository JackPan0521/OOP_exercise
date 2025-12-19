package Project.整合交通禮讓的MonteCarlo模擬系統;

public class Main1 {
    public static void main(String[] args) {
        BaseSampling sampleGenerator = new TrafficSampling(new DriverPool(500) );
        BaseReport report = new TrafficReport();
        
        MonteCarloSimulation sim = new TrafficSimulation(sampleGenerator, report);
        sim.runSimulation(1_000_000);
        
    }
}
