package HW5.Q1;
public class Main {
  public static void main(String[] args) {
		MonteCarloSimulator sim = new MonteCarloSimulator(1.0);
        int N = 1_000_000;

        double piEstimate = sim.estimatePi(N);

        System.out.println("模擬點數 N = " + N);
        System.out.println("估算得到的 π ≈ " + piEstimate);
  }
}
