package Quize0501;

public class ExCardCompany {

    public static void main(String[] args) {
        //CardCompany company = new CardCompany();
        CardCompany company = CardCompany.getInstance();

        Card card = company.createCard();
        Card card2 = company.createCard();
        Card card3 = company.createCard();

    }
}
