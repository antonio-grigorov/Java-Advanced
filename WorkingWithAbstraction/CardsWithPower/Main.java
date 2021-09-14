package src.WorkingWithAbstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner=new Scanner(System.in);

        String type=scanner.nextLine();
        String suit=scanner.nextLine();

        Card card= new Card(CardRank.valueOf(type),CardSuit.valueOf(suit));

        System.out.println(card.toString());

    }
}
