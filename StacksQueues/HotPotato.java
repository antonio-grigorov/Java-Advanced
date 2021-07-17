package StacksQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String children = scanner.nextLine();
        int fatalToss = Integer.parseInt(scanner.nextLine());

        String[] tokens = children.split("\\s+");
        ArrayDeque<String> stackKids = new ArrayDeque<>();

        Collections.addAll(stackKids, tokens);

        int count = 0;

        while(stackKids.size()>1){
            count++;

            if(count==fatalToss){
                System.out.println("Removed "+ stackKids.poll());

                count=0;
            }
            else {
                String currentKid=stackKids.poll();
                stackKids.offer(currentKid);
            }

        }
        System.out.println("Last is "+ stackKids.poll());





    }
}
