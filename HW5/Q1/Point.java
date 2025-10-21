package HW5.Q1;
/**
 * Point 類別代表二維平面上的一個點
 * 封裝了 x, y 座標以及判斷點是否在單位圓內的邏輯
 */
public class Point {
    private double x;
    private double y;
    
    /**
     * 建構函式
     * @param x x 座標
     * @param y y 座標
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * 獲取 x 座標
     * @return x 座標值
     */
    public double getX() {
        return x;
    }
    
    /**
     * 獲取 y 座標
     * @return y 座標值
     */
    public double getY() {
        return y;
    }
    
    /**
     * 判斷此點是否在給定半徑的圓內（以原點為圓心）
     * @param radius 圓的半徑
     * @return 如果點在圓內回傳 true，否則回傳 false
     */
    public boolean isInsideCircle(double radius) {
        return (x * x + y * y) <= (radius * radius);
    }
    
    /**
     * 計算點到原點的距離
     * @return 距離值
     */
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    
    @Override
    public String toString() {
        return String.format("Point(%.6f, %.6f)", x, y);
    }
}