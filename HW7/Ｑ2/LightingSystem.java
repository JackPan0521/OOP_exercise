package HW7.Ｑ2;

public class LightingSystem extends Device {
    private int brightness;

    public LightingSystem(String id, String name) {
        super(id, name);
        brightness = 0;
    }

    public void autoControl(int hour) {
        if (hour >= 18 || hour < 6) {
            turnOn();
            brightness = 80;
            System.out.println("LightingSystem [" + id + "] : Night time → Light ON (Brightness 80%)");
        } else {
            turnOff();
            brightness = 0;
            System.out.println("LightingSystem [" + id + "] : Daytime → Light OFF");
        }
    }

    @Override
    public void showStatus() {
        if (status)
            System.out.println("LightingSystem [" + id + "] is ON (Brightness " + brightness + "%)");
        else
            System.out.println("LightingSystem [" + id + "] is OFF");
    }
}
