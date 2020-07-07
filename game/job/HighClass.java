package game.job;

public class HighClass extends Job {

    @Override
    public void hunting() {
        System.out.println("2차 스킬을 얻어 강력한 공격으로 사냥을 한다.");
    }

    @Override
    public void promote(int input) {
        if (input == 1) {
            super.jobName = "보우마스터";
            System.out.println(super.jobName + " 로 전직합니다.");
            System.out.println("공격 스킬 폭풍의 시를 얻었습니다.");
            System.out.println("폭풍의 시 : 공격력 50으로 두번 공격한다.");
        } else if (input == 2) {
            super.jobName = "신궁";
            System.out.println(super.jobName + " 로 전직합니다.");
            System.out.println("공격 스킬 피어싱을 얻었습니다.");
            System.out.println("피어싱 : 공격력 100으로 한번 공격한다.");
        }
    }
}
