package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class parkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parking = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!"END".equals(input)) {
            String[] split = input.split(".\\s+");
            String command = split[0];
            String plate = split[1];
            if ("IN".equals(command)) {

                parking.add(plate);
            } else if ("OUT".equals(command)) {
                parking.remove(plate);
            }


            input = scanner.nextLine();
        }

        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String carNumber : parking) {
                System.out.println(carNumber);
            }
        }
    }
}
