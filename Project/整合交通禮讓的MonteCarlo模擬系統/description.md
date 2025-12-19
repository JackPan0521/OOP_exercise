利用抽象類別，設計一個整合式的 MonteCarloSimulation 抽象系統，可以整合不同的MonteCarlo 模擬系統，例如，建立交通禮讓態度很重要嗎? (封裝小考練習第14題)
須交報告，報告內容:
1. 本抽象系統的類別架構設計有何好處?如何避免已經死亡的駕駛被重複選到?
2. 本次練習是否有使用AI輔助? (YES/NO)
若有， AI 的回答如何改變我的理解？
3.若有使用AI輔助，有下列兩項目以上者，可加2分 (附上對話紀錄畫面):
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
建立交通禮讓態度很重要嗎?
據統計台灣一年造成傷亡的交通意外事故將近25萬件。
根據下列數據，撰寫JAVA程式，模擬車禍傷亡統計結果。
假設駕駛人分為兩類：禮讓駕駛，搶快駕駛兩類。每類型各５００人。
當兩位駕駛會車時，發生車禍的機率假設如下表：


     禮讓    搶快
禮讓    0.01    0.05
搶快    0.05    0.95
當發生車禍時，造成死亡的機率假設如下表：

     禮讓    搶快
禮讓    0    1
搶快    1    1
1： 雙方死亡
撰寫JAVA程式碼，模擬一百萬件隨機會車時（也就是從所剩下的駕駛人當中任選兩位駕駛人），
根據其發生車禍與造成傷亡的機率，統計下列資訊：
總共發生幾次交通事故？
其中造成死亡的交通事故有幾件？
其中禮讓駕駛人死亡幾位？
其中搶快駕駛人死亡幾位？
提示：物件導向分析
1. 駕駛人（Driver）：具有類型屬性（禮讓、搶快）。
2. DriverPool: 現有駕駛。
3. 會車事件（TrafficEvent）：兩位駕駛隨機組合，依照表格機率決定是否發生事故與死亡。
4. TrafficeSampling類別負責生成樣本(TrafficSample物件)
5. 模擬控制器（TrafficSimulation）：負責重複執行多次會車、計算統計結果。
6. 報表產生器（TrafficReport）：負責記錄與顯示統計報表
測試類別:
public class Main1 {
    public static void main(String[] args) {
        BaseSampling sampleGenerator = new TrafficSampling(new DriverPool(500) );
        BaseReport report = new TrafficReport();
        
        MoteCarloSimulation sim = new TrafficSimulation(sampleGenerator, report);
        sim.runSimulation(1_000_000);
        
    }
}

預期輸出：

範例輸出：
總共發生交通事故：10315
造成死亡的事故：289
禮讓駕駛死亡數：78
搶快駕駛死亡數：500