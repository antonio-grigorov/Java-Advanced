package StacksQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String numbers = scanner.nextLine();
        String[] numbersArray = numbers.split("\\s+");

        int numberToPush = Integer.parseInt(numbersArray[0]);
        int numberToPop = Integer.parseInt(numbersArray[1]);
        int numberToContain = Integer.parseInt(numbersArray[2]);


        String input = scanner.nextLine();
        String[] tokens = input.split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numberToPush; i++) {
            int element = Integer.parseInt(tokens[i]);
            stack.push(element);
        }
        for (int i = 0; i < numberToPop; i++) {
            stack.pop();

        }

        if (stack.contains(numberToContain)) {
            System.out.println(true);
        } else if (!stack.isEmpty()) {
            System.out.println(Collections.min(stack));

        } else {
            System.out.println(0);
        }
    }
}

