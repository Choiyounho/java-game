package game;


public class Character {
    private String nickname;
    private int hp;
    private int potion;
    private String job;
    private int level;
    private int experience;
    private int money;
    private int userNumber;

    public Character(String nickname) {
        this.nickname = nickname;
        this.hp = 500;
        this.potion = 0;
        this.job = "초보자";
        this.level = 1;
        this.experience = 0;
        this.money = 0;
        this.userNumber = (int) (Math.random() * 10000);
    }

    public String getNickname() {
        return nickname;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPotion() {
        return potion;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public void takePotion() {
        if (potion > 0) {
            System.out.println("물약 사용");
            System.out.print("hp : " + hp + " -> ");
            hp += 25;
            System.out.println(hp);
            System.out.print("물약 개수 : " + potion + " -> ");
            potion -= 1;
            System.out.println(potion);
            return;
        } else if (potion == 0) {
            System.out.println("현재 보유하고 있는 물약이 없습니다. 마을에 있는 상점에 가서 물약을 구매해주세요");
            return;
        }
    }

    public void showInfo() {
        System.out.println("=====캐릭터 정보=====");
        System.out.println("캐릭터 정보");
        System.out.println("닉네임 : " + nickname);
        System.out.println("hp : " + hp);
        System.out.println("직업 : " + job);
        System.out.println("Level : " + level);
        System.out.println("exp : " + experience);
        System.out.println("======인벤 토리======");
        System.out.println("물약개수 : " + potion);
        System.out.println("돈 : " + money);
        System.out.println("====================");
    }


}
