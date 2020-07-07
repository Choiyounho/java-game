package game.job;

public class BiginerClass extends Job {

    @Override
    public void promote(int input) {
            super.jobName = "초보자";
        System.out.println("기본공격 : 공격력 25");
    }

    @Override
    public void hunting() {
        System.out.println("기본 공격으로 사냥한다");
    }
}
