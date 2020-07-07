package game.monster;

public class Balog extends Monster {
    private int shield;

    public Balog(String name, int hp) {
        super(name, hp);
        this.shield = 100;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public String fireBall() {
        return "발록의 파이어볼!!";
    }

    public String flapWing() {
        return "발록의 날개치기!!";
    }

    @Override
    public String toString() {
        return "Boss{" +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                "shield=" + shield +
                "} ";
    }
}
