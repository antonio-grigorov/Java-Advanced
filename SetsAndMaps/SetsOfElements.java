package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        int m= scanner.nextInt();

        LinkedHashSet<Integer> first= readSetOfNumbers(n, scanner);
        LinkedHashSet<Integer> second= readSetOfNumbers(m, scanner);

       first.retainAll(second);

        String collect = first.stream()
                .map(i->i +"")
                .collect(Collectors.joining(" "));

        System.out.println(collect);
    }

    private static LinkedHashSet readSetOfNumbers(int count, Scanner scanner) {
        LinkedHashSet<Integer> numbers= new LinkedHashSet<>();

        while(count-- >0){
                numbers.add(scanner.nextInt());

        }
        return numbers;
    }
}
