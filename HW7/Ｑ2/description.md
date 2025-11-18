根據下列系統描述，請：
1. 分析出應該有哪些類別、它們的屬性與方法。
2. 設計合理的繼承階層，體現繼承的優勢。
3. 撰寫簡要的 Java 類別程式碼（不需完整 UI），並建立主程式進行簡單測試。

某智慧農場具備多種感測與控制設備，用於監測環境與自動化控制。系統需求如下：
每個設備 (Device) 都有：
1. 裝置編號 (id)
2. 名稱 (name)
3. 目前狀態 (on/off)
方法：
1. turnOn()、turnOff()
2. showStatus() 顯示當前狀態與資料。
環境監測類裝置：
1. 溫度感測器 (TemperatureSensor)：回傳當前溫度（攝氏）。
若溫度超過 30°C，系統可自動開啟風扇；低於 20°C 可關閉風扇。
2. 濕度感測器 (HumiditySensor)：回傳當前濕度（%）。
若濕度低於 40%，可觸發噴霧系統；若高於 80%，可開啟通風設備。
3. 土壤濕度感測器 (SoilSensor)：監測土壤含水量。
若濕度低於 35%，自動開啟灌溉系統；若高於 60%，則關閉。
自動控制類裝置：
1. 灌溉系統 (IrrigationSystem)：可根據土壤濕度自動開關。
若 sensor.getMoisture() < 40 → turnOn()；否則 turnOff()。
2. 風扇 (Fan)：根據溫度自動開關。
溫度 > 35°C → 高速；25–35°C → 中速；<25°C → 關閉。
3. 照明系統 (LightingSystem)：根據時間或天氣開關。
晚上（hour >= 18 或 < 6）→ turnOn()；白天則關閉。
所有裝置的狀態可被主控台 (Main Console) 監視與控制。
主控台可：
1. 顯示所有設備的目前狀態。
2. 根據各感測器數據，自動啟動對應的控制設備。
測試類別: 
import java.util.*;

public class MainConsole {

    public static void main(String[] args) {

        // === 建立感測器 ===
        TemperatureSensor temp = new TemperatureSensor("T001", "Temp Sensor");
        HumiditySensor hum = new HumiditySensor("H001", "Humidity Sensor");
        SoilSensor soil = new SoilSensor("S001", "Soil Sensor");

        // === 建立控制裝置 ===
        Fan fan = new Fan("F001", "Cooling Fan");
        IrrigationSystem irrig = new IrrigationSystem("I001", "Water Pump");
        LightingSystem light = new LightingSystem("L001", "Greenhouse Light");

        // === 模擬感測數據 ===
        temp.setTemperature(33.5);
        hum.setHumidity(50.0);
        soil.setMoisture(28.0);

        // === 儲存所有設備（多型應用） ===
        ArrayList devices = new ArrayList<>();
        devices.add(temp);
        devices.add(hum);
        devices.add(soil);
        devices.add(fan);
        devices.add(irrig);
        devices.add(light);

        System.out.println("=== Smart Farm Monitoring System ===");
        System.out.println(">> Current sensor readings:");
        for (Device d : devices)
            if (d instanceof Sensor)
                d.showStatus();

        // === 自動控制行為 ===
        System.out.println("\n>> Auto control actions:");
        fan.autoControl(temp);
        irrig.autoControl(soil);
        light.autoControl(20);  // 模擬晚上 8 點（hour = 20）

        // === 顯示控制設備狀態 ===
        System.out.println("\n>> Device status after auto control:");
        for (Device d : devices)
            d.showStatus();
    }
}


範例輸出：
=== Smart Farm System ===
=== Smart Farm Monitoring System ===
>> Current sensor readings:
TemperatureSensor [T001] : 33.5°C
HumiditySensor [H001] : 50.0%
SoilSensor [S001] : 28.0%

>> Auto control actions:
Fan [F001] : Temperature high → Fan ON (Speed Level 2)
IrrigationSystem [I001] : Soil dry → Water Pump ON
LightingSystem [L001] : Night time → Light ON (Brightness 80%)

>> Device status after auto control:
TemperatureSensor [T001] : 33.5°C
HumiditySensor [H001] : 50.0%
SoilSensor [S001] : 28.0%
Fan [F001] is ON (Speed Level 2)
IrrigationSystem [I001] is ON (Auto mode)
LightingSystem [L001] is ON (Brightness 80%)
提示:
1. 繼承共用性: 所有裝置都繼承自 Device，共用 id, name, turnOn/Off, showStatus。
2. 多型應用: 以 ArrayList 統一儲存並操作不同類型裝置。
3. 覆寫方法: (Override)	各子類別皆覆寫 showStatus() 與 autoControl()。
4. 擴充性: 若要新增 CO2Sensor 或 Heater，只需繼承 Device，加入主控台程式。