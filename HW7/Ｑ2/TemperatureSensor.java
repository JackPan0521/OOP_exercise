package HW7.Ｑ2;

public class TemperatureSensor extends Sensor {
    private double temperature;

    public TemperatureSensor(String id, String name) {
        super(id, name);
        this.temperature = 0.0;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void showStatus() {
        System.out.println("TemperatureSensor [" + id + "] : " + temperature + "°C");
    }
}
