package HW7.Q1;

public class Driver {
    public enum Type { COURTEOUS, AGGRESSIVE }  // 禮讓、搶快
    private Type type;

    public Driver(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
