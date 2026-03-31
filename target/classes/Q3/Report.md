# Q3 Worker 介面 ISP 檢視報告

## 一、原始設計是否違反 Interface Segregation Principle
是。原本 `Worker` 同時定義 `work()` 與 `eat()`，但不是所有工作者都需要吃飯。

例如：
- `Human` 需要 `work()` 與 `eat()`。
- `Robot` 只需要 `work()`，不需要 `eat()`。

因此 `Robot` 被迫實作自己不需要的方法，甚至只能用 `UnsupportedOperationException` 應付，這正是違反 ISP 的典型情況。

## 二、新設計
將原本過大的介面拆分：

- `Worker`：只負責 `work()`。
- `Eatable`：只負責 `eat()`。
- `Human`：實作 `Worker` 與 `Eatable`。
- `Robot`：只實作 `Worker`。

## 三、為什麼這樣符合 ISP
ISP 強調「客戶端不應被迫依賴它不使用的方法」。

拆分後：
- `Robot` 不再被迫實作 `eat()`。
- `Human` 只依需求組合所需介面。
- 每個類別只依賴自己真正需要的能力。

## 四、新設計優點
- 降低不必要依賴：類別不必實作自己用不到的方法。
- 提升可讀性：介面名稱與能力更明確，語意更清楚。
- 維護性更好：功能變動時，影響範圍較小。
- 擴充性更高：若未來加入 `Sleepable`、`Rechargeable`，可獨立擴充。
- 減少例外設計：避免用 `UnsupportedOperationException` 掩蓋設計問題。

## 五、結論
原始 `Worker` 介面違反 ISP，因為它把不同角色的需求硬塞進同一介面。拆分成較小、專一的介面後，設計更清楚，也更符合 SOLID 原則。
