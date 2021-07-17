package StacksQueues;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 2 + 5 + 10 - 2 - 1

        String input = scanner.nextLine();
        String[] tokens = input.split("\\s+");

        ArrayDeque<String> result = new ArrayDeque<>();

        Collections.addAll(result,tokens);

        System.out.println(result.pop());
        result.push("+");
        result.push("5");
        System.out.println(result.pop());


    }
}
