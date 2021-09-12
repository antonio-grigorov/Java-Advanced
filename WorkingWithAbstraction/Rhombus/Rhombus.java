package src.WorkingWithAbstraction.Rhombus;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {

        int lines = read(new Scanner(System.in));



        for (int i = 1; i <= lines; i++) {
            printStars(lines, i);

        }
        for (int i = lines - 1; i >= 1; i--) {
            printStars(lines, i);
        }


    }

    private static void printStars(int totalNumberOfStarts, int starsToPrint) {
        int leadingSpaces = totalNumberOfStarts - starsToPrint;
        for (int i = 0; i < leadingSpaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < starsToPrint; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static int read(Scanner scanner) {
        return scanner.nextInt();
    }
}
