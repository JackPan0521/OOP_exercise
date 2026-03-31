package SOLID原則.氣象應用;

interface IObserver {
    // Subject 呼叫此方法通知 Observer
    // sourceName: 是哪個 Subject 發出通知（例如 "WeatherStation"）
    // weather:    最新的天氣資料
    void update(String sourceName, String weather);
}
