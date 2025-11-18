package Q5;

public class Main {
    public static void main(String[] args) {
    Transport t1 = new Bus("Taipei", "Hsinchu", 60);
    Transport t2 = new Train("Taichung", "Kaohsiung", 200, true);
    Transport t3 = new Taxi("Airport", "Hotel", 6);

            System.out.println(t1);
            System.out.println(t2);
            System.out.println(t3);
        }

    }