package src.Iterators.StrategyPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());

        Set<Person> peopleSortedByName=new TreeSet<>(new PersonComparatorByName());
        Set<Person> peopleSortedByAge=new TreeSet<>(new PersonComparatorByAge());

        for (int i = 0; i < number; i++) {
            String input=scanner.nextLine();
            String[] tokens=input.split("\\s+");

            String name=tokens[0];
            int age=Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            peopleSortedByName.add(person);
            peopleSortedByAge.add(person);
        }

        peopleSortedByName
                .forEach(System.out::println);

        peopleSortedByAge
                .forEach(System.out::println);

    }
}
