package src.OOP.Polymorphism.Matrix;

import src.OOP.Polymorphism.Matrix.Cards.Card;

public class Cashier {

    private Card card;
    private Promotion promotion;
    Cashier(Card card, Promotion promotion){
        this.card=card;
        this.promotion=promotion;
    }

    public Double calculateFinalPrice(Double price){
        Double discountedPrice = card.discountedPrice(price);
        return promotion.calculateFor(discountedPrice);
    }
}
