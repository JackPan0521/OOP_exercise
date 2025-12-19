利用抽象類別，設計一個整合式的 MonteCarloSimulation 抽象系統，可以整合不同的MonteCarlo 模擬系統，例如，樂透抽獎 (期中考第一題)
須交報告，報告內容:
1. 本抽象系統的類別架構設計有何好處?
2. 本次練習是否有使用AI輔助? (YES/NO)
若有， AI 的回答如何改變我的理解？
3.若有使用AI輔助，有下列兩項目以上者，依論述品質，最多可加2/5分(依照比例) (附上對話紀錄畫面):
3.1 依據 AI 的回答提出改寫
3.2 主動提出 2 個可能的 bug 原因
3.3 自己測試三種輸入並解釋行為
3.4 在 AI 回答後寫「採納或不採納理由」
============================================
注意: 強化 MonteCarloSimulation 系統的多類別關係設計，例如，
1. BaseSample類別存放樣本，
2. BaseSampling類別負責生成樣本(BaseSample物件)，
3. BaseEvent類別提供事件判斷服務，boolean checkEvent(BaseSample s)
4. Report類別負責紀錄事件結果，並產生統計結果
5. MonteCarloSimulation 類別的 runSimulation(long numEncounters) 負責整個流程控制
===============================================================
樂透規則：從 1~49 中不重複抽出 6 個號碼；玩家也選 6 個號碼。
利用MonteCarlo演算法計算普獎（正確猜中3個號碼的機率）的機率是多少(小數點20位)？
測試程式碼如下，

public class Main1 {
    public static void main(String[] args) {
        BaseSampling sampleGenerator = new LotterSampling彩蛋;
        long N = 1_000_000;
        BaseReport report = new LotterReport(N);
        
        MoteCarloSimulation sim = new LotterSimulation(sampleGenerator, report);
        sim.runSimulation(N);
        
    }
}

預期輸出：

模擬點數 N = 1000000
估算得到的機率 ≈ 0.00000000000000000000 (視隨機狀況有所不同)
提示：
1. 隨機數應用: java.util.RandomRandom 類別用模擬抽樣結果: nextInt(49)隨機產生介於[0, 48]的整數值值。
2. java.util.HashSet提供集合的資料結構，保證元素不重複。
例如 HashSet set = new HashSet<>(); 宣告一個集合物件set。
2.1 set.add(5): 將5加入。 2.2 set.contains(5): 回傳true，假如5在集合內。
2.3 set.size(): 回傳集合的元素個數。
2.4 for (Integer i: set) { //get each item i in set }
3. System.out.printf("估算得到的機率 ≈ %.20f%n", prob);