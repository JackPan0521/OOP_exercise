package Q1;

public class ZooKeeper {
    public String name;

    public ZooKeeper(String name){
        this.name = name;
    }

    public void feed(Animal animal){
        System.out.println(name + " is feeding " + animal.name);
        animal.eat();
    }
}
