package HW7.Ｑ2;

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
        ArrayList<Device> devices = new ArrayList<>();
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
