package game;

import game.monster.Balog;
import game.monster.Lupang;
import game.monster.Mushroom;

public class Hunt {

    public void huntMushroom(Character character) {
        Mushroom mushroom = new Mushroom("주황버섯",50);

        characterDeathCheck(character);
        getHuntingLevel(character, mushroom);

        if (mushroom.getHp() <= 0) {
            mushroomDeath(character, mushroom);
        }
    }

    public void getHuntingLevel(Character character, Mushroom mushroom) {
        if (character.getLevel() > 3) { // 레벨 매개변수, 몬스터 매개변수 버섯 -> 몬스터이름
            System.out.println("버섯 말고 다른 거 잡아용^^ 버섯은 이제 사냥 못해용^^ ");
            System.out.println("마을로 가서 다른 사냥터에 가주세요");
            return;
        }
        else if (character.getLevel() == 1) {
            huntMushBiginer(character);
        } else if (character.getLevel() >= 2) {
            huntMushArcher(character, mushroom);
        }
    }

    public void huntMushBiginer(Character character) {
        Mushroom mushroom = new Mushroom("주황버섯", 50);
        System.out.println("눈 앞에 주황버섯이 보인다.");
        System.out.println("[" + character.getNickname() + "] 의 기본 공격!!");
        System.out.print("[" + mushroom.getName() + "]의 hp : " + mushroom.getHp() + " -> ");

        mushroom.setHp(mushroom.getHp() - 25);

        System.out.println(mushroom.getHp());
        System.out.println("[" + mushroom.getName() + "]의 몸통 박치기!! ");
        System.out.print("[" + character.getNickname() + "]의 hp : " + character.getHp() + " -> ");

        character.setHp(character.getHp() - 10);

        System.out.println(character.getHp());

        characterDeathCheck(character);

        System.out.println("[" + character.getNickname() + "] 의 기본 공격!!");
        System.out.print("[" + mushroom.getName() + "]의 hp : " + mushroom.getHp() + " -> ");

        mushroom.setHp(mushroom.getHp() - 25);

        System.out.println(mushroom.getHp());
    }

    public void huntMushArcher(Character character, Mushroom mushroom) {
        System.out.println("[" + character.getNickname() + "] 의 파워샷!!");
        System.out.print("[" + mushroom.getName() + "]의 hp : " + mushroom.getHp() + " -> ");
        mushroom.setHp(mushroom.getHp() - 50);
    }

    public void mushroomDeath(Character character, Mushroom mushroom) {
        System.out.println("[" + mushroom.getName() + "] 사망\n[" + character.getNickname() + "]의 경험치 +1, 돈 +1");
        character.setExperience(character.getExperience() + 1);
        character.setMoney(character.getMoney() + 1);

        // TODO : 메소드로 빼기 -> huntingComplete( ... )
        if (character.getExperience() >= 5) {
            character.setExperience(character.getExperience() - 5);
            System.out.println("레벨업을 합니다.");
            character.setLevel(character.getLevel() + 1);
            System.out.println("현재레벨 : " + character.getLevel());

            // TODO : 전직을 합니다. 직업을 선택해 주세요.
            // TODO : 메소드로 빼기 -> getRemote 정도 ?
            if (character.getLevel() == 2) {
                System.out.println("초보자 -> 궁수가 됩니다, hp가 100 증가합니다.");
                character.setHp(character.getHp() + 100);
                character.setJob("궁수");
            }
            if (character.getLevel() > 2) {
                System.out.println("레벨업을 하여 hp가 100 증가합니다.");
                character.setHp(character.getHp() + 100);
            }
        }
    }

    public void huntLupang(Character character) {
        Lupang lupang = new Lupang("루팡", 150);
        characterDeathCheck(character);

        if (character.getLevel() < 3) {
            System.out.println("레벨 3부터 루팡을 잡을 수 있습니다. 마을로 가주세요");
            return;
        }

        if (character.getLevel() == 3) {
            huntLupangArcher(character, lupang);
        }

        if (character.getLevel() >= 4 && character.getJob().equals("보우마스터")) {
            huntLupangBowMaster(character, lupang);
        }

        if (character.getLevel() >= 4 && character.getJob().equals("신궁")) {
            huntLupangCrossbowMaster(character, lupang);
        }

        if (lupang.getHp() <= 0) {
            lupangDeath(character, lupang);
        }
        return;

    }

    public void huntLupangArcher(Character character, Lupang lupang) {
        System.out.println(character.getNickname() + "의 파워샷 !!");
        System.out.print("루팡의 hp : " + lupang.getHp() + " -> ");
        lupang.setHp(lupang.getHp() - 50);
        System.out.println(lupang.getHp());
        System.out.println("루팡의 바나나 던지기!!");
        System.out.print(character.getNickname() + "의 hp :" + character.getHp() + " -> ");
        character.setHp(character.getHp() - 25);
        System.out.println(character.getHp());

        characterDeathCheck(character);

        System.out.println(character.getNickname() + "의 파워샷 !!");
        System.out.print("루팡의 hp : " + lupang.getHp() + " -> ");
        lupang.setHp(lupang.getHp() - 50);
        System.out.println(lupang.getHp());
        System.out.println("루팡의 바나나 던지기!!");
        System.out.print(character.getNickname() + "의 hp :" + character.getHp() + " -> ");
        character.setHp(character.getHp() - 25);
        System.out.println(character.getHp());

        characterDeathCheck(character);

        System.out.println(character.getNickname() + "의 파워샷 !!");
        System.out.print("루팡의 hp : " + lupang.getHp() + " -> ");
        lupang.setHp(lupang.getHp() - 50);
        System.out.println(lupang.getHp());
    }

    public void huntLupangBowMaster(Character character, Lupang lupang) {
        System.out.println(character.getNickname() + "의 폭풍의 시!!");
        System.out.print("루팡의 hp : " + lupang.getHp() + " -> ");
        lupang.setHp(lupang.getHp() - 50);
        System.out.println(lupang.getHp());
        System.out.println(character.getNickname() + "의 폭풍의 시!!");
        System.out.print("루팡의 hp : " + lupang.getHp() + " -> ");
        lupang.setHp(lupang.getHp() - 50);
        System.out.println(lupang.getHp());
        System.out.println("루팡의 바나나 던지기!!");
        System.out.print(character.getNickname() + "의 hp :" + character.getHp() + " -> ");
        character.setHp(character.getHp() - 25);
        System.out.println(character.getHp());

        characterDeathCheck(character);

        System.out.println(character.getNickname() + "의 폭풍의 시!!");
        System.out.print("루팡의 hp : " + lupang.getHp() + " -> ");
        lupang.setHp(lupang.getHp() - 50);
        System.out.println(lupang.getHp());
    }

    public void huntLupangCrossbowMaster(Character character, Lupang lupang) {
        System.out.println(character.getNickname() + "의 피어싱!");
        System.out.print("루팡의 hp : " + lupang.getHp() + " -> ");
        lupang.setHp(lupang.getHp() - 100);
        System.out.println(lupang.getHp());
        System.out.println("루팡의 바나나 던지기!!");
        System.out.print(character.getNickname() + "의 hp :" + character.getHp() + " -> ");
        character.setHp(character.getHp() - 25);
        System.out.println(character.getHp());

        characterDeathCheck(character);

        System.out.println(character.getNickname() + "의 피어싱!");
        System.out.print("루팡의 hp : " + lupang.getHp() + " -> ");
        lupang.setHp(lupang.getHp() - 50);
        System.out.println(lupang.getHp());
    }

    public void lupangDeath(Character character, Lupang lupang) {
        System.out.println("[" + lupang.getName() + "] 사망\n[" + character.getNickname() + "]의 경험치 +2, 돈 +2");
        character.setExperience(character.getExperience() + 2);
        character.setMoney(character.getMoney() + 2);

        // TODO : 264 라인까지 huntingComplete로 빼기
        if (character.getExperience() >= 5) {
            character.setExperience(character.getExperience() - 5);
            System.out.println("레벨업을 합니다.");
            character.setLevel(character.getLevel() + 1);
            System.out.println("현재레벨 : " + character.getLevel());
            System.out.println("레벨업을 하여 hp가 100 증가합니다.");
            System.out.print("현재 hp: " + character.getHp() + " -> ");
            character.setHp(character.getHp() + 100);
            System.out.println(character.getHp());

            if (character.getLevel() == 4 && character.getJob().equals("궁수")) {
                System.out.println("2차전직이 가능합니다. 마을에 가서 전직을하세요");
            }
        }
    }

    public void challengeBalog(Character character) {
        Balog balog = new Balog("발록", 300);
        characterDeathCheck(character);

        if (character.getLevel() < 7) {
            System.out.println("레벨 7부터 발록에게 도전할 수 있습니다. 마을로 가주세요");
            return;
        }
        // TODO : 직업 클래스 만들고 리팩토링
        if (character.getJob().equals("보우마스터")) {
            challengeBalogBowMaster(character, balog);
        }
        if (character.getJob().equals("신궁")) {
            challengeBalogCrossbowMaster(character, balog);
        }
        if (balog.getHp() <= 0) {
            balogDeath(character, balog);
        }
    }

    public void challengeBalogBowMaster(Character character, Balog balog) {
        String nickname = character.getNickname();
        int hp = character.getHp();
        String balogName = balog.getName();
        int balogShield = balog.getShield();
        int balogHp = balog.getHp();

        System.out.println(balogName + " 에게 도전합니다.");
        System.out.println(nickname + "의 폭풍의 시!!");
        System.out.print(balogName + " 의 방어막 : " + balogShield + " -> ");
        balogShield -= 50;
        System.out.println(balogShield);

        System.out.println(nickname + "의 폭풍의 시!!");
        System.out.print(balogName + " 의 방어막 : " + balogShield + " -> ");
        balogShield -= 50;
        System.out.println(balogShield);
        System.out.println(balog.fireBall());
        System.out.print(nickname + "의 hp :" + hp + " -> ");

        hp -= 50;
        System.out.println(hp);

        characterDeathCheck(character);

        System.out.println(nickname + "의 폭풍의 시!!");
        System.out.print(balogName + " 의 hp : " + balogHp + " -> ");
        balogHp -= 50;
        System.out.println(balogHp);
        System.out.println(nickname + "의 폭풍의 시!!");
        System.out.print(balogName + " 의 hp : " + balogHp + " -> ");
        balogHp -= 50;
        System.out.println(balogHp);
        System.out.println(balog.fireBall());
        System.out.print(nickname + "의 hp :" + hp + " -> ");
        hp -= 50;
        System.out.println(hp);

        characterDeathCheck(character);

        System.out.println(nickname + "의 폭풍의 시!!");
        System.out.print(balogName + " 의 hp : " + balogHp + " -> ");
        balogHp -= 50;
        System.out.println(balogHp);
        System.out.println(nickname + "의 폭풍의 시!!");
        System.out.print(balogName + " 의 hp : " + balogHp + " -> ");
        balogHp -= 50;
        System.out.println(balogHp);
        System.out.println(balog.fireBall());
        System.out.print(getCharacterHealthCheck(nickname, hp));
        hp -= 50;
        System.out.println(hp);
        characterDeathCheck(character);

        System.out.println(nickname + "의 폭풍의 시!!");
        System.out.print(balogName + " 의 hp : " + balogHp + " -> ");
        balogHp -= 50;
        System.out.println(balogHp);
        System.out.println(nickname + "의 폭풍의 시!!");
        System.out.print(balogName + " 의 hp : " + balogHp + " -> ");
        balogHp -= 50;

        if (balogHp <= 0) {
            System.out.println(balogDeath(character,balog));
        }
    }

    public void challengeBalogCrossbowMaster(Character character, Balog balog) {
        System.out.println("발록에게 도전합니다.");
        System.out.println(character.getNickname() + "의 피어싱!!");
        System.out.print("발록의 방어막 : " + balog.getShield() + " -> ");
        balog.setShield(balog.getShield() - 100);
        System.out.println(balog.getShield());
        balog.fireBall();
        System.out.print(character.getNickname() + "의 hp :" + character.getHp() + " -> ");
        character.setHp(character.getHp() - 100);
        System.out.println(character.getHp());

        characterDeathCheck(character);

        System.out.println(character.getNickname() + "의 피어싱!!");
        System.out.print("발록의 방어막 : " + balog.getHp() + " -> ");
        balog.setHp(balog.getHp() - 100);
        System.out.println(balog.getHp());
        balog.fireBall();
        System.out.print(character.getNickname() + "의 hp :" + character.getHp() + " -> ");
        character.setHp(character.getHp() - 100);
        System.out.println(character.getHp());

        characterDeathCheck(character);

        System.out.println(character.getNickname() + "의 피어싱!!");
        System.out.print("발록의 hp : " + balog.getHp() + " -> ");
        balog.setHp(balog.getHp() - 100);
        System.out.println(balog.getHp());
        balog.fireBall();
        System.out.print(character.getNickname() + "의 hp :" + character.getHp() + " -> ");
        character.setHp(character.getHp() - 100);
        System.out.println(character.getHp());

        characterDeathCheck(character);

        System.out.println(character.getNickname() + "의 피어싱!!");
        System.out.print("발록의 hp : " + balog.getHp() + " -> ");
        balog.setHp(balog.getHp() - 100);
        System.out.println(balog.getHp());

        System.out.println(balogDeath(character, balog));
    }

    public String balogDeath(Character character, Balog balog) {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("[" + balog.getName() + "] 사망")
                .append("\n")
                .append("[" + character.getNickname() + "]의 게임클리어");

        return stringBuffer.toString();
    }

    private String getCharacterHealthCheck(String nickname, int healthPoint) {
        return nickname + "의 hp :" + healthPoint + " -> ";
    }

    private void characterDeathCheck(Character character) {
        if (character.getHp() <= 0) {
            System.out.println("캐릭터가 사망했습니다.");
            System.out.println("=====GAVE OVER=====");
            System.out.println("=====GAVE OVER=====");
            System.out.println("=====GAVE OVER=====");
            System.out.println("=====GAVE OVER=====");
        }
    }
    // TODO : 직업 클래스 만들고 리팩토링
    // TODO : 방금 보우마스터을 리팩토링 함 -> 신궁도 해야함
    // 그리고 직업 도메인을 만들고 2차전직 2개로 나뉘어진 것을 1개의 메소드로 합쳐야함
    // 그럴바에 직업을 제대로 만들고 신궁 메소드는 지우고 보우마스터를 리팩토링 하기
}






