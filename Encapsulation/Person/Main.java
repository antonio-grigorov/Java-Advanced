package src.OOP.Encapsulation.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        PersonParser personParser = new PersonParser();

        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            try {
                people.add(personParser.from(line));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
        Team team=new Team("Spartak");
        team.getFirstTeam().add(new Person("aaa","aaa",55,555));
        double bonus=Double.parseDouble(reader.readLine());
        people.sort(new PersonComparator());

        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person);
        }
    }

}
