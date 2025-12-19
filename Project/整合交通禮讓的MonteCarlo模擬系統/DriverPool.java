package Project.整合交通禮讓的MonteCarlo模擬系統;

import java.util.*;

public class DriverPool {
    private List<Driver> drivers = new ArrayList<>();
    private Random rand = new Random();

    public DriverPool(int eachType) {
        for (int i = 0; i < eachType; i++) {
            drivers.add(new Driver(Driver.Type.POLITE));
            drivers.add(new Driver(Driver.Type.AGGRESSIVE));
        }
    }

    public Driver randomAliveDriver() {
        List<Driver> alive = drivers.stream()
                .filter(Driver::isAlive)
                .toList();
        if (alive.size() < 2) return null;
        return alive.get(rand.nextInt(alive.size()));
    }
}

