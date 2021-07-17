package StacksQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 2 + 5 + 10 - 2 - 1

        String input = scanner.nextLine();
        String[] tokens = input.split("\\s+");
        int operation = 0;
        ArrayDeque<Integer> result = new ArrayDeque<>();

        result.push(Integer.parseInt(tokens[0]));

        for (int i = 1; i < tokens.length; i += 2) {
            int num=Integer.parseInt(tokens[i + 1]);
            int stackNum=result.pop();
            if ("-".equals(tokens[i])) {
                operation = stackNum - num;

            } else if("+".equals(tokens[i])){
                operation = stackNum + num;

            }
            result.push(operation);


        }
        System.out.println(result.pop());


    }
}
