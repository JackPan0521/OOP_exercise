package Project.整合交通禮讓的MonteCarlo模擬系統;

public class Driver {
    enum Type { POLITE, AGGRESSIVE }

    private Type type;
    private boolean alive = true;

    public Driver(Type type) {
        this.type = type;
    }

    public Type getType() { return type; }
    public boolean isAlive() { return alive; }
    public void die() { alive = false; }
}
