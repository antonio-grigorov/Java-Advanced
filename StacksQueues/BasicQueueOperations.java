package StacksQueues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputTokens = input.split("\\s+");

        int numbersToOffer = Integer.parseInt(inputTokens[0]);
        int numbersToPoll = Integer.parseInt(inputTokens[1]);
        int numberToContain = Integer.parseInt(inputTokens[2]);

        String inputNumbers = scanner.nextLine();
        String[] tokens = inputNumbers.split("\\s+");

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < numbersToOffer; i++) {
            int element = Integer.parseInt(tokens[i]);
            queue.offer(element);
        }

        for (int i = 0; i < numbersToPoll; i++) {
            queue.poll();
        }

        if(queue.contains(numberToContain)){
            System.out.println(true);
        }
        else {
            System.out.println(queue.stream().min(Integer::compareTo).orElse(0));


        }

    }
}
