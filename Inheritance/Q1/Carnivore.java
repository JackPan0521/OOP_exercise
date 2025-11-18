package Q1;

public class Carnivore extends Animal {
    public Carnivore(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println(name + " is eating meat.");
    }
}
