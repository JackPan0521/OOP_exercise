# Q8 DrawingTool SRP 檢視報告

## 一、原始設計是否違反 Single Responsibility Principle
是，原本 `DrawingTool` 同時包含 `drawCircle()` 與 `drawSquare()`，代表它同時承擔多個形狀的繪製細節。

- 若圓形繪製規則改變，`DrawingTool` 要改。
- 若方形繪製規則改變，`DrawingTool` 也要改。

同一個類別有多個「改變理由」，屬於 SRP 風險。

## 二、新設計
將責任拆分為：

- `Drawable`：抽象繪製能力。
- `Circle`：只負責畫圓（`畫圓`）。
- `Square`：只負責畫方形（`畫方形`）。
- `DrawingTool`：只負責呼叫可繪製物件的 `draw()`。

## 三、需求驗證
1. `Drawable p = new Circle(); p.draw()` 會顯示 `畫圓`。
2. `Drawable p = new Square(); p.draw()` 會顯示 `畫方形`。

## 四、新設計優點
- 符合 SRP：每個類別只有單一職責與單一改變理由。
- 擴充容易：新增 `Triangle` 只需新增類別，不必改既有繪圖邏輯。
- 可讀性提升：形狀行為集中在各自類別，維護更直觀。
- 測試更簡單：可分別測試 `Circle` 與 `Square` 的輸出。
- 降低耦合：`DrawingTool` 依賴抽象 `Drawable`，不綁定具體形狀。
