package HW7.Q1;

import java.util.Random;

public class Encounter {
    private Driver d1;
    private Driver d2;
    private boolean accident; // 是否發生車禍
    private boolean death;    // 是否有人死亡
    private int courteousDeaths;
    private int aggressiveDeaths;

    public Encounter(Driver d1, Driver d2) {
        this.d1 = d1;
        this.d2 = d2;
        simulate();
    }

    private void simulate() {
        // 車禍機率表
        double[][] accidentProb = {
            {0.01, 0.05},
            {0.05, 0.95}
        };

        // 死亡機率表（發生車禍後）
        int[][] deathProb = {
            {0, 1},
            {1, 1}
        };

        int i = (d1.getType() == Driver.Type.COURTEOUS) ? 0 : 1;
        int j = (d2.getType() == Driver.Type.COURTEOUS) ? 0 : 1;

        Random rand = new Random();
        accident = rand.nextDouble() < accidentProb[i][j];

        if (accident) {
            if (deathProb[i][j] == 1) {
                death = true;
                // 雙方死亡
                if (d1.getType() == Driver.Type.COURTEOUS) courteousDeaths++;
                else aggressiveDeaths++;
                if (d2.getType() == Driver.Type.COURTEOUS) courteousDeaths++;
                else aggressiveDeaths++;
            }
        }
    }

    public boolean isAccident() { return accident; }
    public boolean isDeath() { return death; }
    public int getCourteousDeaths() { return courteousDeaths; }
    public int getAggressiveDeaths() { return aggressiveDeaths; }
}
