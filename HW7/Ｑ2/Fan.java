package HW7.Ｑ2;

public class Fan extends Device {
    private int speed; // 0=off, 1=medium, 2=high

    public Fan(String id, String name) {
        super(id, name);
        speed = 0;
    }

    public void autoControl(TemperatureSensor tempSensor) {
        double temp = tempSensor.getTemperature();
        if (temp > 35) {
            turnOn();
            speed = 2;
            System.out.println("Fan [" + id + "] : Temperature high → Fan ON (Speed Level 2)");
        } else if (temp >= 25) {
            turnOn();
            speed = 1;
            System.out.println("Fan [" + id + "] : Temperature moderate → Fan ON (Speed Level 1)");
        } else {
            turnOff();
            speed = 0;
            System.out.println("Fan [" + id + "] : Temperature low → Fan OFF");
        }
    }

    @Override
    public void showStatus() {
        if (status)
            System.out.println("Fan [" + id + "] is ON (Speed Level " + speed + ")");
        else
            System.out.println("Fan [" + id + "] is OFF");
    }
}

