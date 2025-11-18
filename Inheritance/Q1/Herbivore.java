package Q1;

public class Herbivore extends Animal{
    public Herbivore(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println(name + " is eating plants.");
    }
    
}
