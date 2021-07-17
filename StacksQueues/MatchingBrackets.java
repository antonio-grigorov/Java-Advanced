package StacksQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

// 1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5

            String input=scanner.nextLine();


        ArrayDeque<Integer> bracketIndexes = new ArrayDeque<>();

        for (int i = 0; i <input.length(); i++) {
            String output="";
            String currentIndex=""+input.charAt(i);
            if(currentIndex.equals("(")){

                bracketIndexes.push(i);

            }
            if(currentIndex.equals(")")){
                int startIndex=bracketIndexes.pop();
                int endIndex=i;

                output= input.substring(startIndex,endIndex+1);


                System.out.println(output);
            }
        }


    }
}
