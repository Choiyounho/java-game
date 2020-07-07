package game.monster;

public abstract class Monster {

    public abstract void attact();

    protected String name;
    protected int hp;

    public Monster(String name, int hp){
        this.name=name;
        this.hp=hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
