package SOLID原則.氣象應用;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ISubject {
    private List<IObserver> observers = new ArrayList<>();  // 儲存所有訂閱者
    private String weather;

    // ---- ISubject 介面實作 ----
    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        // 把「自己的類別名稱」和「最新天氣」推給每個 Observer
        for (IObserver o : observers) {
            o.update(weather);
        }
    }

    // ---- 業務邏輯 ----
    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();   // 狀態改變 → 立刻通知所有人
    }

    public String getWeather() {
        return weather;
    }
}