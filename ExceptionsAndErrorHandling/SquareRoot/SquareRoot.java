package SquareRoot;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        try{

            double sqrt = Math.sqrt(n);
            System.out.println(sqrt);
        } catch (ArithmeticException ex){
            System.out.println("Invalid number");
        } finally {
            System.out.println("Good bye");
        }


    }
}
