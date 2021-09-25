package src.OOP.Encapsulation.Person;

public class PersonParser {


    public static Person from(String line) {
        String[] split = line.split("\\s+");

        String firstName = split[0];
        String lastName = split[1];
        int age = Integer.parseInt(split[2]);
        double salary = Double.parseDouble(split[3]);


        return new Person(firstName, lastName, age, salary);
    }


}
