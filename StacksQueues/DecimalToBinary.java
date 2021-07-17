package StacksQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int input=Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> binaryStack=new ArrayDeque<>();

        if(input==0){
            System.out.println(0);
            return;
        }
        while(input>0){
            if(input%2==0){
                binaryStack.push(0);
            }
            else {
                binaryStack.push(1);
            }
            input/=2;

        }

        while(!binaryStack.isEmpty()){
            System.out.print(binaryStack.pop());
        }




    }
}
