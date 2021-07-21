package SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class CitiesByContinentAndCountries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();


        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();

            String[] tokens = input.split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            map.putIfAbsent(continent, new LinkedHashMap<>());
            map.get(continent).putIfAbsent(country, new ArrayList<>());
            map.get(continent).get(country).add(city);


        }

        map.forEach((key, value) -> {
            System.out.println(String.format("%s:", key));
            value.forEach((k, v) -> {
                String cities = "";
                cities+=map.get(key).get(k).stream().collect(Collectors.joining(", "));


                System.out.println(String.format("  %s -> %s", k, cities));

            });
        });


    }
}
