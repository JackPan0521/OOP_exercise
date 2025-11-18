package HW5.Q2;

public class Vehicle {
    protected String model;
    
    public Vehicle(String model) {
        this.model = model;
        System.out.println("Vehicle is created");
    }
    
    public Vehicle() {
        this.model = "Unknown";
        System.out.println("Vehicle is created");
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
}