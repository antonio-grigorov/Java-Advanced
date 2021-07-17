package StacksQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String input=scanner.nextLine();

        ArrayDeque<String> queueForward= new ArrayDeque<>();
        ArrayDeque<String> stackBack=new ArrayDeque<>();
        String output="";
        String transfer="";
        while(!"Home".equals(input)){

            switch (input){
                case"back":
                    if(stackBack.size()<=1){
                        output="no previous URLs";
                    }
                    else{
                        transfer=stackBack.pop();
                        queueForward.push(transfer);
                        output=stackBack.peek();
                    }
                    break;
                case"forward":
                    if(queueForward.size()<1){
                        output="no next URLs";
                    }
                    else {
                        output=queueForward.pop();

                    stackBack.push(output); }

                    break;
                default:
                    output=input;
                    stackBack.push(input);
                    queueForward.clear();

            }

            System.out.println(output);
            input=scanner.nextLine();
        }



    }
}
