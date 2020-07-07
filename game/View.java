package game;


public class View {

    // TODO: 1. 직업 궁수 2차전직 클래스 나누기 -> 자동 전직 x

    public void intro() {
        System.out.println("레벨업을 해서 발록을 처치하세요 그럼 게임 클리어 입니다.");
        System.out.println("이 게임은 최윤호의 프로젝트입니다. ");
        System.out.println("초보자로 시작하여 레벨 2때 궁수로 자동전직 하고, 레벨5때는 2차 전직을 합니다. ");
        System.out.println("2차 전직때는 보우마스터와 신궁 중 선택을 해야합니다..");
        System.out.println("전직을 할 때마다 스킬이 생깁니다. ");
        System.out.println("보우마스터는 빠른 공격속도를 가지고 있고, 신궁은 느리지만 강한 파워를 가집니다.");
        System.out.println("몬스터를 사냥하여 레벨업을해서 주니어 발록을 처치해 게임을 클리어 해보세요");
        System.out.println("물약을 사용하면 hp가 25 증가합니다.");
        System.out.println("레벨업을 하면 hp가 100 증가합니다.");
        System.out.println("단, 한번 죽으면 처음부터 다시 해야합니다.\n");
    }

    public void menu() {
        System.out.println("무엇을 하시겠습니까?");
        System.out.println("1.사냥터 이동 2.상점이용 3.물약사용 4.내 정보 조회 5.1차전직 6. 2차전직 7.게임 그만하기");
    }


}
