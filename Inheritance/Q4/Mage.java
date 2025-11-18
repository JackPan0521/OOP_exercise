package Q4;

class Mage extends Character{
    protected int mp;

    public Mage(String name, int hp, int atk, int mp){
        super(name, hp, atk);
        this.mp = mp;
    }

    @Override
    public void attack(Character target){
        if(mp >= 10){
            mp -= 10;
            int dam = (int)(atk * 1.5);
            target.takeDamage(dam);
            System.out.println(toString(target, dam));
        }else{
            System.out.println("MP 不足，無法施法");
        }
    }

    @Override
    public void takeDamage(int dam){
        hp -= dam;
        hp = Math.max(0, hp);
    }

    public String toString(Character target, int dam){
        return String.format("%s casts a spell on %s for %d damage! MP = %d, %s HP = %d",name ,target.name ,dam ,mp ,target.name ,target.hp);
    }
}