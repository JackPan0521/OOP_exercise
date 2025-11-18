package Q4;

class Warrior extends Character {
    public Warrior(String name, int hp, int atk){
        super(name, hp, atk);
    }

    @Override
    public void attack(Character target){
        int dam =(int)(atk * 1.2);
        target.takeDamage(dam);
        System.out.println(toString(target, dam));
    }

    @Override
    public void takeDamage(int dem){
        hp -= dem;
        hp = Math.max(0, hp);
    }

    public String toString(Character target, int dam){
        return String.format("%s attacks %s for %d damage! %s HP = %d",name ,target.name ,dam ,target.name ,target.hp);
    }
}
