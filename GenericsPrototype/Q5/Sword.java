package GenericsPrototype.Q5;

public class Sword implements Cloneable{
    private String type;
    private int damage;

    public Sword(String type, int damage){
        this.damage = damage;
        this.type = type;
    }
    
    public void setType(String type){
        this.type = type;
    }

    public void show(){
        System.out.printf("%s Damage=%d\r\n",type,damage);
    }

    public Sword copy() throws CloneNotSupportedException{
        return (Sword) clone();
    }
}
