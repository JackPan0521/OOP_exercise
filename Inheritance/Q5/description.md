設計一個交通票價系統，根據不同交通工具（巴士、公車、高鐵、計程車）計算票價。
需使用繼承機制（不含抽象類別或介面），所有子類別繼承自 Transport。

類別與建構子設計說明

1.  Transport 類別 — 基底類別:
    用途：所有交通工具的共同資料與行為。
    屬性：
    String start：起點名稱
    String end：終點名稱
    double distance：兩地之間距離 (公里)
    建構子與參數意義：
    public Transport(String start, String end, double distance)

2.  Bus 類別 — 繼承自 Transport:
    規則：每公里 10 元，若距離超過 20 公里打 9 折。
    計算方式：fare = distance _ 10；若 distance > 20 → fare _= 0.9。

    建構子：public Bus(String start, String end, double distance)

3.  Train 類別 — 繼承自 Transport:
    規則：每公里 8 元，若為高鐵列車加成 20%。

    建構子：public Train(String start, String end, double distance, boolean highSpeed)
    highSpeed: boolean 是否為高鐵（true 表示高鐵）
    若 highSpeed == true，票價乘以 1.2。

4.  Taxi 類別 — 繼承自 Transport:
    規則：前 2 公里收費 70 元。之後每公里 25 元。

    建構子：public Taxi(String start, String end, double distance)
    若 distance(距離) ≤ 2，收 70 元；否則 fare = 70 + (distance - 2) \* 25。
    測試類別:
    public class Main {
    public static void main(String[] args) {
    Transport t1 = new Bus("Taipei", "Hsinchu", 60);
    Transport t2 = new Train("Taichung", "Kaohsiung", 200, true);
    Transport t3 = new Taxi("Airport", "Hotel", 6);

            System.out.println(t1);
            System.out.println(t2);
            System.out.println(t3);
        }

    }

範例輸出：
Bus fare: 540.0
Train fare: 1920.0
Taxi fare: 170.0
