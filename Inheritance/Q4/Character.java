package Q4;

class Character {
    protected String name;
    protected int hp, atk;

    public Character(String name, int hp, int atk){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    public void attack(Character character){}

    public void takeDamage(int dam){}
}
