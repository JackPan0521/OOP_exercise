package Q1;

public class Main {
public static void main(String[] args) {
Animal a1 = new Herbivore("Elephant");
Animal a2 = new Carnivore("Lion");

        ZooKeeper keeper = new ZooKeeper("John");
        keeper.feed(a1);
        keeper.feed(a2);
    }

}