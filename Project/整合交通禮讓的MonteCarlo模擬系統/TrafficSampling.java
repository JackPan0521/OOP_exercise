package Project.整合交通禮讓的MonteCarlo模擬系統;

//import java.util.Random;

public class TrafficSampling extends BaseSampling {
    private DriverPool pool;
    //private Random rand = new Random();

    public TrafficSampling(DriverPool pool) {
        this.pool = pool;
    }

    @Override
    public BaseSample nextSample() {
        Driver d1 = pool.randomAliveDriver();
        Driver d2 = pool.randomAliveDriver();
        if (d1 == null || d2 == null || d1 == d2) return null;
        return new TrafficSample(d1, d2);
    }
}
