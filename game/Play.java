package game;


import game.job.HighClass;
import game.job.MiddleClass;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        View view = new View();
        view.intro();

        // TODO :  캐릭터가 죽으면 게임이 끝나지 않고 계속 진행이됨.
        // TODO :  발록 사냥
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.아이디 생성 2.게임종료");
            int input = scanner.nextInt();
            if (input == 1) {
                input = 0;
                System.out.println("닉네임을 입력해주세요. 닉네임은 영어+한글로 2~6 글자입니다.");
                String nickname = scanner.next();
                Character character = new Character(nickname);
                if (nickname.length() < 2) {
                    System.out.println("글자 수 제한을 지켜주세요");
                    continue;
                }
                if (nickname.length() > 6) {
                    System.out.println("글자 수 제한을 지켜주세요");
                    continue;
                }

                character.showInfo();

                while (true) {
                    if (character.getHp() <= 0) {
                        System.out.println("캐릭터가 사망 하였습니다. 재도전을 하시려면 아이디를 생성하고 하기싫으면 게임 종료하세요");
                        break;
                    }
                    System.out.println("현재위치 : 마을");
                    view.menu();
                    input = scanner.nextInt();
                    if (input == 1) {
                        System.out.println("현재위치 : 마을");
                        System.out.println("1.주황버섯의 굴로간다 2.루팡의 숲으로 간다 3.발록의 신전으로 간다");
                        input = scanner.nextInt();
                        if (input == 1) {
                            while (true) {
                                input = 0;
                                if (character.getHp() <= 0) {
                                    break;
                                }
                                System.out.println("현재 위치 : 주황버섯의 굴");
                                System.out.println("주황 버섯이 나타났습니다!!");
                                System.out.println("1. 주황버섯을 잡는다 2. 엄폐 후 물약을 먹는다 3. 마을로간다");
                                input = scanner.nextInt();
                                if (input == 1) {
                                    input = 0;
                                    Hunt hunt = new Hunt();
                                    hunt.huntMushroom(character);
                                } else if (input == 2) {
                                    input = 0;
                                    character.takePotion();
                                } else if (input == 3) {
                                    input = 0;
                                    break;
                                } else {
                                    System.out.println("잘못입력하셨습니다");
                                }
                            }
                        }
                        if (input == 2) {
                            while (true) {
                                input = 0;
                                if (character.getHp() <= 0) {
                                    break;
                                }
                                System.out.println("현재 위치 : 루팡의 숲");
                                System.out.println("루팡이 나타났습니다!!");
                                System.out.println("1. 루팡을 잡는다 2. 엄폐 후 물약을 먹는다 3. 마을로간다");
                                input = scanner.nextInt();
                                if (input == 1) {
                                    input = 0;
                                    if (character.getLevel() >= 4 && character.getJob().equals("궁수")) {
                                        System.out.println("2차 전직을 위해 마을로 자동으로 이동됩니다.");
                                        break;
                                    }
                                    Hunt hunt = new Hunt();
                                    hunt.huntLupang(character);
                                } else if (input == 2) {
                                    input = 0;
                                    character.takePotion();
                                } else if (input == 3) {
                                    input = 0;
                                    break;
                                } else {
                                    System.out.println("잘못입력하셨습니다");
                                }
                            }
                        }
                        if (input == 3) {
                            while (true) {
                                input = 0;
                                if (character.getHp() <= 0) {
                                    break;
                                }
                                System.out.println("현재 위치 : 발록의 신전");
                                System.out.println("보스몬스터 발록 등장!!");
                                System.out.println("1. 발록과 싸운다! 2. 엄폐 후 물약을 먹는다 3. 마을로간다");
                                input = scanner.nextInt();
                                if (input == 1) {
                                    input = 0;
                                    Hunt hunt = new Hunt();
                                    hunt.challengeBalog(character);
                                    return;
                                } else if (input == 2) {
                                    input = 0;
                                    character.takePotion();
                                } else if (input == 3) {
                                    input = 0;
                                    break;
                                } else {
                                    System.out.println("잘못입력하셨습니다");
                                }
                            }
                        }
                    }
                    if (input == 2) {
                        System.out.println("현재위치 : 상점");
                        System.out.println("상점에 오신 것을 환영합니다. 물약의 가격은 1원 입니다.");
                        while (true) {
                            input = 0;
                            System.out.println("1.포션구매 2.상점 나가기");
                            input = scanner.nextInt();
                            if (input == 1) {
                                Store store = new Store();
                                store.buyPotion(character, input);
                            } else if (input == 2) {
                                break;
                            } else {
                                System.out.println("잘못입력하셨습니다");
                            }
                        }
                    }
                    if (input == 3) {
                        character.takePotion();
                    }
                    if (input == 4) {
                        character.showInfo();
                    }if (input == 5) {
                        input = 0;
                        if (character.getLevel() < 2){
                            System.out.println("레벨업을 더 하고 오세요");
                            continue;
                        }
                        System.out.println("궁수로 전직하시겠습니까?");
                        input = scanner.nextInt();
                        MiddleClass middleClass = new MiddleClass();
                        middleClass.promote(input);
                    }
                    if (input == 6) {
                        input = 0;
                        System.out.println("2차전직을 진행합니다.");
                        System.out.println("1. 보우마스터 - 빠른 공격속도 2. 신궁 - 강한 공격력");
                        input = scanner.nextInt();
                        HighClass highClass = new HighClass();
                        highClass.promote(input);
                        if (input == 1) { character.setJob("보우마스터"); }
                        if (input == 2) { character.setJob("신궁"); }
//                        character.promote(input);
                    }
                    if (input == 7) {
                        System.out.println("게임을 종료합니다");
                        input = 0;
                        break;
                    }
                }
            } else if (input == 2) {
                break;
            } else {
                System.out.println("잘못입력하였습니다");
            }
        }
    }
}




