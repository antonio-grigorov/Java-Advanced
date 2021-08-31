package src.Iterators.EqualityLogic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());


        Set<Person> peopleHashSet=new HashSet<>();
        for (int i = 0; i < number; i++) {
            String input=scanner.nextLine();
            String[] tokens=input.split("\\s+");

            String name=tokens[0];
            int age=Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);

            peopleHashSet.add(person);
        }



        System.out.println(peopleHashSet.size());
    }
}
