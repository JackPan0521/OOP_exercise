package HW7.Q1;

import java.util.*;

public class TrafficSimulation {
    private List<Driver> drivers = new ArrayList<>();
    private int totalAccidents = 0;
    private int totalDeathAccidents = 0;
    private int courteousDeaths = 0;
    private int aggressiveDeaths = 0;

    public TrafficSimulation() {
        // 建立500禮讓 + 500搶快駕駛
        for (int i = 0; i < 500; i++) {
            drivers.add(new Driver(Driver.Type.COURTEOUS));
            drivers.add(new Driver(Driver.Type.AGGRESSIVE));
        }
    }

    public void runSimulation(int encounters) {
        Random rand = new Random();

        for (int i = 0; i < encounters; i++) {
            Driver d1 = drivers.get(rand.nextInt(drivers.size()));
            Driver d2 = drivers.get(rand.nextInt(drivers.size()));

            // 避免同一位駕駛與自己會車
            while (d1 == d2) {
                d2 = drivers.get(rand.nextInt(drivers.size()));
            }

            Encounter e = new Encounter(d1, d2);

            if (e.isAccident()) {
                totalAccidents++;
                if (e.isDeath()) {
                    totalDeathAccidents++;
                    courteousDeaths += e.getCourteousDeaths();
                    aggressiveDeaths += e.getAggressiveDeaths();
                }
            }
        }
    }

    public void report() {
        System.out.println("總共發生交通事故：" + totalAccidents);
        System.out.println("造成死亡的事故：" + totalDeathAccidents);
        System.out.println("禮讓駕駛死亡數：" + courteousDeaths);
        System.out.println("搶快駕駛死亡數：" + aggressiveDeaths);
    }
}
