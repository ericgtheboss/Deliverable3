package Deliverable3;

public abstract class Card {

    private String cardSuit;
    private int cardNumber;

    public String getCardSuit(String cardSuit) {
        return cardSuit;
    }

    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }

    public int getCardNumber(int cardNumber) {
        return cardNumber;
    }


    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

}