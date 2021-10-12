package src.OOP.Polymorphism.Matrix.Cards;

public abstract class Card {

     private Double discountPercentage;

     public Card(Double discount){
         this.discountPercentage =discount;
     }

     public final Double discountedPrice(Double price){
         Double discountSum = price * this.discountPercentage;
         return price-discountSum;

     }
}
