package SetsAndMaps;

import java.util.*;

public class softUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputGuest = scanner.nextLine().trim();

        Set<String> guests = new TreeSet<>();

        while (!"PARTY".equals(inputGuest)) {
            guests.add(inputGuest);

            inputGuest = scanner.nextLine();
        }

        inputGuest = scanner.nextLine();

        while (!"END".equals(inputGuest)) {
            guests.remove(inputGuest);

            inputGuest = scanner.nextLine();
        }

        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }


    }
}
