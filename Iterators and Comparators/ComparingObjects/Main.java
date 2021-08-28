package src.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        String input=scanner.nextLine();

        while(!"END".equals(input)){
            String[] data=input.split("\\s+");
            Person person = new Person(data[0],Integer.parseInt(data[1]),data[2]);

            people.add(person);

            input=scanner.nextLine();
        }

        int n=Integer.parseInt(scanner.nextLine());

        Person searchedPerson = people.get(n-1);
        people.remove(searchedPerson);
        int countEquals=1;

        for (Person person : people) {
            if(searchedPerson.compareTo(person)==0){
                countEquals++;
            }
        }

        if(countEquals==1){
            System.out.println("No matches");
        }
        else {
            System.out.print(countEquals +" ");
            System.out.print(people.size()-countEquals+1+" ");
            System.out.print(people.size()+1);
        }



    }
}
