package game.monster;

public class Mushroom extends Monster {

    private String spore;

    public Mushroom(String name, int hp) {
        super(name = "주황버섯", hp = 50);
        this.spore="버섯";
    }

    public String getSpore() {
        return spore;
    }

    // TODO: 상속을 위해 구현
    public String headbutt (){return name+"의 박치기!!";}
    public String trample (){return name+"의 내려찍기!!";}

    @Override
    public String toString() {
        return "Normal{" +
                " name='" + name + '\'' +
                ", hp=" + hp +
                ", spore='" + spore +
                "'} ";
    }
}
