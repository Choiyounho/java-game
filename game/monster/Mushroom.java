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

    public String headbutt (){return name+"의 박치기!!";}
    public String trample (){return name+"의 내려찍기!!";}
}
