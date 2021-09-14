package src.WorkingWithAbstraction.CardsWithPower;

public class Card {
    private CardRank type;
    private CardSuit suit;

    public Card(CardRank type, CardSuit suit){
        this.type=type;
        this.suit=suit;
    }

    @Override
    public String toString(){
        return String.format("Card name: %s of %s; Card power: %d",type,suit,getPower());
    }

    private Integer getPower() {

        return type.getValue() +
                suit.getValue();
    }
}
