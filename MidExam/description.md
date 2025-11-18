樂透規則：從 1~49 中不重複抽出 6 個號碼；玩家也選 6 個號碼。

利用MonteCarlo演算法計算頭獎（正確猜中6個號碼的機率）的機率是多少(小數點20位)？

 測試程式碼如下，強化MonteCarloSquare關係的多類別關係的設計，
 例如，
 1. Sample類別存放 6 個號碼，
 2. Sampling類別負責生成6個隨機號碼(Sample物件)，
 3. Event類別提供事件判斷服務(是否中普獎)，boolean checkEvent(Sample s1, Sample S2)
 4. MonteCarloLotter: 負責流程控制，以及機率的估測

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

預期輸出：
模擬點數 N = 1000
估算得到的機率 ≈ 0.00000000000000000000 (視隨機狀況有所不同)

模擬點數 N = 1000000
估算得到的機率 ≈ 0.00000000000000000000 (視隨機狀況有所不同)

模擬點數 N = 100000000
估算得到的機率 ≈ 0.00000003000000000000 (視隨機狀況有所不同)
提示：
1. 隨機數應用: java.util.RandomRandom 類別用模擬抽樣結果: nextInt(49)隨機產生介於[0, 48]的整數值值。
2. java.util.HashSet提供集合的資料結構，保證元素不重複。
例如 HashSet<Integer> set = new HashSet<>(); 宣告一個集合物件set。
2.1 set.add(5): 將5加入。
2.2 set.contains(5): 回傳true，假如5在集合內。
2.3 set.size(): 回傳集合的元素個數。
2.4 for (Integer i: set) { //get each item i in set }

3. System.out.printf("估算得到的機率 ≈ %.20f%n", prob); //輸出格式化(小數點下20位數)