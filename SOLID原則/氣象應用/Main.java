package SOLID原則.氣象應用;

public class Main {
    public static void main(String[] args) {
      ISubject subject = new WeatherStation( );
      IObserver obs  = new WeatherDisplay ("Taipei") ; 
      subject.registerObserver( obs ) ; 
      ((WeatherStation) subject).setWeather("Cold"); //顯示 "Taipei received WeatherStation update. New weather: Cold "
      subject.removeObserver( obs ) ; 
  }
}
