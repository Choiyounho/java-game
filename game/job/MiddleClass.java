package game.job;

public class MiddleClass extends Job {



    @Override
    public void hunting() {
        super.skill = "파워샷";
        System.out.println(super.skill + " 으로 사냥한다.");
        System.out.println("파워샷 공격력 : 50");
    }

    @Override
    public void promote(int input) {
        if (input == 1) {
            super.jobName = "궁수";
            System.out.println(super.jobName + " 로 전직이 된다.");
            System.out.println("기본 공격이 파워샷이 된다.");
            System.out.println("파워샷 : 공격력 50");
        } else { System.out.println("잘못입력하였습니다."); return;}
    }
}
