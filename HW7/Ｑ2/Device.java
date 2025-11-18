package HW7.Ｑ2;

public abstract class Device {
    protected String id;
    protected String name;
    protected boolean status;

    public Device(String id, String name) {
        this.id = id;
        this.name = name;
        this.status = false;
    }

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
    }

    public abstract void showStatus();
}
