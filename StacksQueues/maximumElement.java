package StacksQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class maximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < numberCommands; i++) {

            String command = scanner.nextLine();
            String[] tokens = command.split("\\s+");
            String operation = tokens[0];

            switch (operation) {
                case "1":
                    int element = Integer.parseInt(tokens[1]);
                    queue.push(element);
                    break;
                case "2":
                    if (queue.size() > 0)
                        queue.pop();
                    break;

                case "3":
                    int minElement = 0;

                    for (int j = 0; j < queue.size(); j++) {

                        int numberToPoll = queue.poll();
                        if (numberToPoll > minElement) {
                            minElement = numberToPoll;
                        }
                        queue.offer(numberToPoll);
                    }
                    System.out.println(minElement);
                    break;
                default:
                    break;


            }


        }

    }
}
