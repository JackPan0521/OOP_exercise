請建立 Vehicle 類別，具備專屬的model(String)資料。
設計Car 類別繼承 Vehicle，當 Car 被建立時，應該先呼叫 Vehicle 的建構子。
最後，說明你的設計重點：
1. 建立Car物件時，與父類別Vehicle的建構子有甚麼關係:
2. 從本例子中，你學到super()是甚麼:
另外，設計Main類別進行下列測試：
c 是Car物件，model是 "Tesla"
e.introduce();

輸出：
Vehicle is created
Car model: Tesla.

---

## 程式設計重點說明

### 1. 建立Car物件時，與父類別Vehicle的建構子有甚麼關係：

**建構子鏈結（Constructor Chaining）關係：**
- 當創建 `Car` 物件時，Java 會自動遵循**建構子鏈結**的規則
- **執行順序**：父類別的建構子 **必須先** 執行，然後才執行子類別的建構子
- 在我們的例子中：
  1. `new Car("Tesla")` 被呼叫
  2. Car 的建構子中的 `super("Tesla")` 先執行，呼叫 Vehicle 的建構子
  3. Vehicle 建構子執行，印出 "Vehicle is created" 並設定 model
  4. 回到 Car 建構子，繼續執行子類別的程式碼

**為什麼需要這樣的關係：**
- 確保父類別的資料成員（如 `model`）被正確初始化
- 維持物件的完整性，子類別可以安全地使用父類別提供的功能
- 遵循 "is-a" 的繼承關係，Car 是一種 Vehicle

### 2. 從本例子中，你學到super()是甚麼：

**super() 的核心概念：**
- `super()` 是 Java 中用來**明確呼叫父類別建構子**的關鍵字
- 它是子類別與父類別之間溝通的橋樑

**super() 的重要特性：**

1. **必須是第一行**：`super()` 必須是子類別建構子的第一行程式碼
2. **參數傳遞**：可以傳遞參數給父類別的建構子，如 `super(model)`
3. **自動呼叫**：如果沒有明確寫 `super()`，Java 會自動呼叫父類別的無參數建構子
4. **明確控制**：使用 `super(參數)` 可以指定要呼叫父類別的哪個建構子

**實際運用範例：**
```java
public Car(String model) {
    super(model);  // 明確呼叫 Vehicle(String model) 建構子
    // 確保父類別的 model 資料被正確設定
}
```

**學習重點：**
- `super()` 體現了物件導向的繼承精神
- 它確保物件的初始化過程是完整且有序的
- 透過 `super()` 可以重用父類別的初始化邏輯，避免程式碼重複

**測試結果驗證：**
```
Vehicle is created      ← 父類別建構子先執行
Car model: Tesla.      ← 子類別的 introduce() 方法執行
```

這個輸出完美展示了建構子的執行順序和繼承關係的正確實現。