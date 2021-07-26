package FunctionalProgramming;

import java.util.Random;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String[] name=input.split("\\s+");

        Consumer<String[]> printString= array->{
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        };
        printString.accept(name);


    }
}
