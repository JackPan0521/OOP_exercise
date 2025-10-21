public class Car extends Vehicle {
    
    public Car(String model) {
        super(model);
    }
    
    public void introduce() {
        System.out.println("Car model: " + model + ".");
    }
    
    public Car() {
        super();
    }
}