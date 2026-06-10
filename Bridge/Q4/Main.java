package Bridge.Q4;

public class Main {
    public static void main(String[] args) {
        Shape p = new Nonagon(new LowResolution() );
        p.display(); //顯示 "我是Nonagon"
        p.drawShape(); //顯示 "繪製低解析圖形"

        p = new Star(new HighResolutionResolution() );
        p.display(); //顯示 "我是Star"
        p.drawShape(); //顯示 "繪製高解析圖形"
    }
}
