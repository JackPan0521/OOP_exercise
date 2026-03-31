package SOLID原則.氣象應用;

public class WeatherDisplay implements IObserver {
    private String cityName;   // 這個顯示器代表哪個城市

    public WeatherDisplay(String cityName) {
        this.cityName = cityName;
    }

    // Subject 呼叫此方法把資料「推」進來，不需要反過來去問 Subject
    @Override
    public void update(String weather) {
        System.out.println(cityName + " received " + sourceName + " update. New weather: " + weather);
    }
}