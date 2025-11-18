package HW7.Ｑ2;

public class IrrigationSystem extends Device {
    public IrrigationSystem(String id, String name) {
        super(id, name);
    }

    public void autoControl(SoilSensor soilSensor) {
        double moisture = soilSensor.getMoisture();
        if (moisture < 40) {
            turnOn();
            System.out.println("IrrigationSystem [" + id + "] : Soil dry → Water Pump ON");
        } else {
            turnOff();
            System.out.println("IrrigationSystem [" + id + "] : Soil wet → Water Pump OFF");
        }
    }

    @Override
    public void showStatus() {
        System.out.println("IrrigationSystem [" + id + "] is " + (status ? "ON (Auto mode)" : "OFF"));
    }
}
