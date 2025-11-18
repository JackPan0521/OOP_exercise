package HW7.Ｑ2;

public class SoilSensor extends Sensor {
    private double moisture;

    public SoilSensor(String id, String name) {
        super(id, name);
        this.moisture = 0.0;
    }

    public void setMoisture(double moisture) {
        this.moisture = moisture;
    }

    public double getMoisture() {
        return moisture;
    }

    @Override
    public void showStatus() {
        System.out.println("SoilSensor [" + id + "] : " + moisture + "%");
    }
}
