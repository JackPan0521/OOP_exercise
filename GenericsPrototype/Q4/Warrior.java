package GenericsPrototype.Q4;

public class Warrior implements Cloneable {
    private String name;
    private int hp,attack;
    private static Warrior prototype;

    private Warrior(String name,int hp, int attack){
        this.attack = attack;
        this.hp = hp;
        this.name = name;
    }

    public static Warrior getPrototype(String name, int hp, int attack){
        if(prototype==null)
            return new Warrior(name, hp, attack);
        return prototype;
    }

    public void setName(String name){
        this.name = name;
    }

    public void show(){
        System.out.printf("%s HP=%d ATK=%d\r\n",name,hp,attack);
    }

    @Override
    public Warrior clone() throws CloneNotSupportedException{
        return (Warrior) super.clone();
    }
}
