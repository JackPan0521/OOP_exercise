package Q4;

class Archer extends Character {
    public Archer(String name, int hp, int atk){
        super(name, hp, atk);
    }

    @Override
    public void attack(Character target){
        int attackTimes = 0;
        int dam = atk;
        target.takeDamage(dam);
        if(Math.random() >= 0.5){
            target.takeDamage(dam);
            attackTimes = 2;
        }else attackTimes = 1;
        System.out.println(toString(target, dam, attackTimes));
    }

    @Override
    public void takeDamage(int dam){
        hp -= dam;
        hp = Math.max(0, hp);
    }

    public String toString(Character target, int dam, int attackTimes){
        if(attackTimes == 2){
            return String.format("%s fires two arrows at %s for %d damage! %s HP = %d",name ,target.name ,dam*2 ,target.name ,target.hp);
        }
        return String.format("%s fires an arrow at %s for %d damage! %s HP = %d",name ,target.name ,dam ,target.name ,target.hp);
    }
}
