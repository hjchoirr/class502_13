package Quize0501;

public class Card {
    private int cardNo;
    private static int serialNo = 10000;

    public Card() {
        serialNo++;
        cardNo = serialNo;
        System.out.println("카드발급, 카드번호 : " + cardNo);
    }
}
