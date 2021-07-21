package SetsAndMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> realNumbers = new LinkedHashMap<>();

        String inputLine = scanner.nextLine();
        String[] split = inputLine.split("\\s+");

        for (String element : split) {

            Double dbl =Double.parseDouble(element);

            if (realNumbers.containsKey(dbl)) {
                Integer previousValue = realNumbers.get(dbl);
                realNumbers.put(dbl, previousValue + 1);
            } else {
                realNumbers.put(dbl, 1);
            }
        }

        for (Map.Entry<Double, Integer> element : realNumbers.entrySet()) {
            String line = String.format("%.1f -> %d", element.getKey(), element.getValue());
            System.out.println(line);
        }


    }
}
