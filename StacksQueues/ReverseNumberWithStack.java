package StacksQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberWithStack {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        String input=scanner.nextLine();
        String[] inputArray=input.split("\\s+");


        ArrayDeque<Integer> stack=new ArrayDeque<>();

        for (int i = 0; i <inputArray.length ; i++) {

            stack.push(Integer.parseInt(inputArray[i]));
        }

        while(!stack.isEmpty())
        {
            System.out.print(stack.pop() +" ");
        }



    }
}
