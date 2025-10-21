package HW5.Q1;
import java.util.Random;

/**
 * MonteCarloSimulator 類別實現蒙地卡羅方法來估算圓周率 π
 * 透過在正方形內隨機撒點，統計落在圓內的點數比例來估算 π 值
 */
public class MonteCarloSimulator {
    private double radius;           // 圓的半徑
    private Random randomGenerator;  // 隨機數生成器
    private int totalPoints;         // 總模擬點數
    private int pointsInsideCircle;  // 落在圓內的點數
    
    /**
     * 建構函式
     * @param radius 圓的半徑（通常為 1.0）
     */
    public MonteCarloSimulator(double radius) {
        this.radius = radius;
        this.randomGenerator = new Random();
        this.totalPoints = 0;
        this.pointsInsideCircle = 0;
    }
    
    /**
     * 建構函式（可指定隨機種子）
     * @param radius 圓的半徑
     * @param seed 隨機數種子，用於可重現的結果
     */
    public MonteCarloSimulator(double radius, long seed) {
        this.radius = radius;
        this.randomGenerator = new Random(seed);
        this.totalPoints = 0;
        this.pointsInsideCircle = 0;
    }
    
    /**
     * 生成一個隨機點在 [0, radius) x [0, radius) 的正方形內
     * @return 隨機生成的點
     */
    private Point generateRandomPoint() {
        double x = randomGenerator.nextDouble() * radius;
        double y = randomGenerator.nextDouble() * radius;
        return new Point(x, y);
    }
    
    /**
     * 執行單次模擬，生成一個隨機點並檢查是否在圓內
     * @return 如果點在圓內回傳 true，否則回傳 false
     */
    private boolean simulateOnePoint() {
        Point point = generateRandomPoint();
        boolean isInside = point.isInsideCircle(radius);
        
        totalPoints++;
        if (isInside) {
            pointsInsideCircle++;
        }
        
        return isInside;
    }
    
    /**
     * 估算圓周率 π
     * @param n 模擬的點數
     * @return 估算的 π 值
     */
    public double estimatePi(int n) {
        // 重置計數器
        totalPoints = 0;
        pointsInsideCircle = 0;
        
        // 執行 n 次模擬
        for (int i = 0; i < n; i++) {
            simulateOnePoint();
        }
        
        // 根據公式計算 π：π ≈ 4 * (圓內點數 / 總點數)
        return 4.0 * pointsInsideCircle / totalPoints;
    }
    
    /**
     * 獲取落在圓內的點數比例
     * @return 比例值（0 到 1 之間）
     */
    public double getInsideCircleRatio() {
        if (totalPoints == 0) {
            return 0.0;
        }
        return (double) pointsInsideCircle / totalPoints;
    }
    
    /**
     * 獲取總模擬點數
     * @return 總點數
     */
    public int getTotalPoints() {
        return totalPoints;
    }
    
    /**
     * 獲取落在圓內的點數
     * @return 圓內點數
     */
    public int getPointsInsideCircle() {
        return pointsInsideCircle;
    }
    
    /**
     * 獲取圓的半徑
     * @return 半徑值
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * 詳細的估算結果，包含統計資訊
     * @param n 模擬的點數
     * @return 包含詳細資訊的結果字串
     */
    public String detailedEstimation(int n) {
        double piEstimate = estimatePi(n);
        
        StringBuilder result = new StringBuilder();
        result.append("=== Monte Carlo π 估算結果 ===\n");
        result.append("模擬點數 N = ").append(totalPoints).append("\n");
        result.append("落在圓內的點數 = ").append(pointsInsideCircle).append("\n");
        result.append("落在圓內的比例 = ").append(String.format("%.6f", getInsideCircleRatio())).append("\n");
        result.append("估算得到的 π ≈ ").append(String.format("%.6f", piEstimate)).append("\n");
        result.append("與真實 π 的誤差 ≈ ").append(String.format("%.6f", Math.abs(Math.PI - piEstimate)));
        
        return result.toString();
    }
}