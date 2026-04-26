package Quiz2.Question3;

public class Main {
    public static void main(String[] args) {
        ISubject subject = new WeatherStation();
        IObserver observer = new WeatherDisplay("Taipei");

        subject.registerObserver(observer);
        ((WeatherStation) subject).setWeather("Cold");
        subject.removeObserver(observer);
    }
}