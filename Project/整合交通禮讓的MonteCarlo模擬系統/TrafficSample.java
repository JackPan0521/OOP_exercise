package Project.整合交通禮讓的MonteCarlo模擬系統;

public class TrafficSample extends BaseSample {
    public Driver d1, d2;
    public boolean accident = false;
    public boolean death = false;

    public TrafficSample(Driver d1, Driver d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}
