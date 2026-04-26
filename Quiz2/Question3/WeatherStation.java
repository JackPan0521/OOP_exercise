package Quiz2.Question3;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ISubject {
    private final List<IObserver> observers = new ArrayList<>();
    private String weather;

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }

    public String getWeather() {
        return weather;
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(weather);
        }
    }
}