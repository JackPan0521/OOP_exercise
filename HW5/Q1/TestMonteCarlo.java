package HW5.Q1;
/**
 * 測試程式，展示 MonteCarloSimulator 的完整功能
 */
public class TestMonteCarlo {
    public static void main(String[] args) {
        // 建立 Monte Carlo 模擬器
        MonteCarloSimulator sim = new MonteCarloSimulator(1.0);
        
        // 測試不同的 N 值
        int[] testSizes = {1000, 10000, 100000, 1000000};
        
        System.out.println("=== Monte Carlo 方法估算圓周率 π 測試 ===");
        System.out.println("真實的 π 值：" + Math.PI);
        System.out.println();
        
        for (int n : testSizes) {
            double piEstimate = sim.estimatePi(n);
            double error = Math.abs(Math.PI - piEstimate);
            
            System.out.println("模擬點數 N = " + n);
            System.out.println("落在圓內的比例 = " + String.format("%.6f", sim.getInsideCircleRatio()));
            System.out.println("估算得到的 π ≈ " + String.format("%.6f", piEstimate));
            System.out.println("誤差 = " + String.format("%.6f", error));
            System.out.println("-".repeat(50));
        }
        
        // 詳細測試
        System.out.println("\n=== 詳細測試結果 ===");
        System.out.println(sim.detailedEstimation(1000000));
    }
}