package Project.整合交通禮讓的MonteCarlo模擬系統;

public class TrafficReport extends BaseReport {
    private int totalAccidents = 0;
    private int deathAccidents = 0;
    private int politeDeaths = 0;
    private int aggressiveDeaths = 0;

    private TrafficEvent event = new TrafficEvent();

    @Override
    public void record(BaseSample s) {
        TrafficSample ts = (TrafficSample) s;

        if (!event.checkEvent(ts)) return;
        totalAccidents++;

        if (ts.d1.getType() == Driver.Type.POLITE &&
            ts.d2.getType() == Driver.Type.POLITE) return;

        deathAccidents++;
        if (ts.d1.isAlive()) {
            ts.d1.die();
            count(ts.d1);
        }
        if (ts.d2.isAlive()) {
            ts.d2.die();
            count(ts.d2);
        }
    }

    private void count(Driver d) {
        if (d.getType() == Driver.Type.POLITE) politeDeaths++;
        else aggressiveDeaths++;
    }

    @Override
    public void printReport() {
        System.out.println("總共發生交通事故：" + totalAccidents);
        System.out.println("造成死亡的事故：" + deathAccidents);
        System.out.println("禮讓駕駛死亡數：" + politeDeaths);
        System.out.println("搶快駕駛死亡數：" + aggressiveDeaths);
    }
}

