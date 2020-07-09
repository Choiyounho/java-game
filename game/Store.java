package game;

public class Store {

    // TODO : 확장성을 고려할 경우
    // Item item = new Item();
    // private String productName
    // private String productQuantity
    // private int productPrice;
    // List<Item> . . . 이런식으로 사용


    public void buyPotion(Character character, int input) {
        int money = character.getMoney();
        int potion = character.getPotion();

        if (input == 1) {
            if (money < 1) {
                System.out.println("돈이 부족해요 사냥해서 돈을 모아오세요 ^^");
                return;
            }

            System.out.println("포션 구매에 성공하셨습니다.");
            System.out.print("돈 : " + money + " -> ");

            character.setMoney(money -= 1);

            System.out.println(money);
            System.out.print("물약 개수 : " + potion + " -> ");

            character.setPotion(potion += 1);

            System.out.println(potion);
        } else if (input == 2) {
            System.out.println("상점에서 나갑니다.");
        } else {
            System.out.println("잘못입력하셨습니다");
        }
    }

}
