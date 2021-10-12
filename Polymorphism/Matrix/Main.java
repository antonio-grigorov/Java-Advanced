package src.OOP.Polymorphism.Matrix;

import src.OOP.Polymorphism.Matrix.Cards.Card;
import src.OOP.Polymorphism.Matrix.Cards.GoldCard;
import src.OOP.Polymorphism.Matrix.Cards.SilverCard;

public class Main {
    public static void main(String[] args) {

        Cashier cashier = new Cashier(
                new GoldCard(),
                new Promotion());




    }
}
