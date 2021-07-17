package StacksQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class    PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] plants = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int[] days = new int[n];
        ArrayDeque<Integer> stackPlants = new ArrayDeque<>();
        stackPlants.push(0);
        for (int i = 1; i < plants.length; i++) {
            int day = 0;

            while (!stackPlants.isEmpty() && plants[stackPlants.peek()] >= plants[i]) {
                day = Math.max(day, days[stackPlants.pop()]);

            }
            if(!stackPlants.isEmpty()){
                days[i]=day+1;
            }
            stackPlants.push(i);

        }
        System.out.println(Arrays.stream(days).max().getAsInt());
    }
}
