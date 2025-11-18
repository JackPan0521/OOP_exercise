public class Main {
    public static void main(String[] args) {
        MonteCarloLotter monte = new MonteCarloLotter();

        long N = 1000;
        double prob = monte.estimate(N);
        System.out.println("模擬點數 N = " + N);
        System.out.println("估算得到的機率 ≈ " + prob);

        N = 1_000_000;
        prob = monte.estimate(N);
        System.out.println("\n模擬點數 N = " + N);
        System.out.println("估算得到的機率 ≈ " + prob);

        N = 100_000_000;
        prob = monte.estimate(N);
        System.out.println("\n模擬點數 N = " + N);
        System.out.println("估算得到的機率 ≈ " + prob);
    }
}