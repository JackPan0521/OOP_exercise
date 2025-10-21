已知辺長1的正方形，面積是1。以其邊長為半徑，在正方形內對角點畫一個弧，可得到面積是PI/4的四分之一圓。
撰寫程式，模擬平均撒N個點在正方形內，然後統計落在圓內的點除以N所得的值再乘上4，結果是多少？
當N很大時，結果跟圓周率PI有沒有關係？

修改下列程式碼，強化其類別關係的設計，強化OOP設計的角度：

import java.util.Random;

public class MonteCarloPi {
    public static void main(String[] args) {
        int N = 1_000_000; // 模擬點的數量，可自行調整
        double countInside = 0.0;

        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            // 在 [0,1) × [0,1) 的正方形內隨機取一點 (x, y)
            double x = rand.nextDouble();
            double y = rand.nextDouble();

            // 四分之一圓的判斷式：x^2 + y^2 <= 1
            if (x * x + y * y <= 1.0) {
                countInside++;
            }
        }

        // 根據公式估算 π
        double piEstimate = 4.0 * countInside / N;

        System.out.println("模擬點數 N = " + N);
        System.out.println("落在圓內的比例 = " + (countInside / N));
        System.out.println("估算得到的 π ≈ " + piEstimate);
    }
}
預期輸出：
模擬點數 N = 1000000
落在圓內的比例 = 0.785432
估算得到的 π ≈ 3.141728

---
## 程式設計重點報告

### 1. 類別之間關係設計的合理性

**設計架構說明：**
- **Point 類別**：負責表示二維空間中的一個點，封裝了座標資訊和幾何計算邏輯
- **MonteCarloSimulator 類別**：負責執行蒙地卡羅模擬，管理隨機數生成和統計計算
- **Main 類別**：作為程式的入口點，展示如何使用模擬器

**關係設計的合理性：**
1. **單一責任原則（SRP）**：每個類別都有明確且單一的責任
   - `Point`：處理點的座標和幾何運算
   - `MonteCarloSimulator`：執行模擬邏輯和統計計算
   
2. **組合關係**：`MonteCarloSimulator` 使用 `Point` 類別來表示隨機生成的點，這是一種 "has-a" 的關係，符合物件導向設計原則

3. **封裝性**：所有類別都適當地隱藏內部實現細節，只暴露必要的公開介面

4. **可擴展性**：設計允許未來輕易增加新功能，例如不同的隨機分布或其他幾何形狀的模擬

### 2. 其他設計重點

**功能完整性：**
- 提供了多個建構函式，支援指定隨機種子以獲得可重現的結果
- 實現了詳細的統計資訊收集和報告功能
- 支援多種輸出格式，包括簡單結果和詳細分析

**程式品質：**
- 完整的 JavaDoc 文件註解，提高程式碼可讀性
- 適當的錯誤處理和邊界條件檢查
- 符合 Java 命名慣例和程式設計規範

**數學正確性：**
- 正確實現了蒙地卡羅方法的數學原理
- 準確計算圓周率的估算公式：π ≈ 4 × (圓內點數 / 總點數)
- 提供誤差分析功能，便於評估估算品質

**測試結果：**
```
模擬點數 N = 1000000
落在圓內的比例 = 0.785524
估算得到的 π ≈ 3.142096
與真實 π 的誤差 ≈ 0.000503
```

**結論：**
當 N 很大時（如 1,000,000），估算結果確實非常接近真實的圓周率 π ≈ 3.14159，證明了蒙地卡羅方法的有效性。隨著樣本數增加，估算精度會提高。

---

測試主類別如下

public class Main {
  public static void main(String[] args) {
		MonteCarloSimulator sim = new MonteCarloSimulator(1.0);
        int N = 1_000_000;

        double piEstimate = sim.estimatePi(N);

        System.out.println("模擬點數 N = " + N);
        System.out.println("估算得到的 π ≈ " + piEstimate);
  }
}

提示：
1. 隨機數應用: java.util.RandomRandom 類別用模擬抽樣結果: nextDouble()隨機產生介於[0, 1)的值。