package StacksQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String input=scanner.nextLine();
        String output="";
        ArrayDeque<String> stack =new ArrayDeque<>();

        while(!"Home".equals(input)){
            switch (input){
                case"back":
                    if(stack.size()<=1){
                       output="no previous URLs";
                    }
                    else{
                        stack.pop();
                       output=stack.peek();
                    }
                    break;
                default:
                    output=input;
                    stack.push(input);

            }
            System.out.println(output);
            input=scanner.nextLine();


        }
    }
}
