package StacksQueues;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n=scanner.nextInt();


        long result= fibonacci(n);

        System.out.println(result);
    }

    private static long fibonacci(int n) {
        if(n<=1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }
}
