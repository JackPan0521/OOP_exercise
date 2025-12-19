package Project.整合交通禮讓的MonteCarlo模擬系統;

import java.util.Random;

public class TrafficEvent extends BaseEvent {
    private Random rand = new Random();

    @Override
    public boolean checkEvent(BaseSample s) {
        TrafficSample ts = (TrafficSample) s;
        double p;

        if (ts.d1.getType() == Driver.Type.POLITE &&
            ts.d2.getType() == Driver.Type.POLITE) p = 0.01;
        else if (ts.d1.getType() == Driver.Type.AGGRESSIVE &&
                 ts.d2.getType() == Driver.Type.AGGRESSIVE) p = 0.95;
        else p = 0.05;

        ts.accident = rand.nextDouble() < p;
        return ts.accident;
    }
}
