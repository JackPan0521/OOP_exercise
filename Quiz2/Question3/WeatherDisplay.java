package Quiz2.Question3;

public class WeatherDisplay implements IObserver {
    private final String location;

    public WeatherDisplay(String location) {
        this.location = location;
    }

    @Override
    public void update(String weather) {
        System.out.println(location + " received WeatherStation update. New weather: " + weather);
    }
}