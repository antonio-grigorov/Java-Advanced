package ValidPersons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Person p = new Person("", "Thompson", 15);
        } catch (PersonCreationException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
