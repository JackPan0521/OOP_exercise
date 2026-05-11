package GenericsPrototype.Q4;

public class Warrior implements Cloneable {
    String name;
    int hp,attack;

    public Warrior(String name,int hp, int attack){
        this.attack = attack;
        this.hp = hp;
        this.name = name;
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
