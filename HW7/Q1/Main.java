package HW7.Q1;

public class Main {
    public static void main(String[] args) {
        TrafficSimulation sim = new TrafficSimulation();
        sim.runSimulation(1_000_000);
        sim.report();
    }
}
