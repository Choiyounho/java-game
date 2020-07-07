package game.monster;

public class Lupang extends Monster {

    private String weapon;

    public Lupang(String name, int hp) {
        super(name, hp);
        this.weapon ="바나나";
    }

    public String getWeapon() {
        return weapon;
    }

    // TODO : 상속을 위해 구현
    public String throwBanana(){
        return super.name +"의 " + getWeapon()+"던지기!!";
    }

    @Override
    public String toString() {
        return "Lupang{" + '\'' +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                "weapon='" + weapon +
                "} ";
    }
}
