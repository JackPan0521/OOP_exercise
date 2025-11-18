package HW7.Ｑ2;

public class HumiditySensor extends Sensor {
    private double humidity;

    public HumiditySensor(String id, String name) {
        super(id, name);
        this.humidity = 0.0;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getHumidity() {
        return humidity;
    }

    @Override
    public void showStatus() {
        System.out.println("HumiditySensor [" + id + "] : " + humidity + "%");
    }
}
