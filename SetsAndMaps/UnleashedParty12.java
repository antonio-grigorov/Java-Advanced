package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnleashedParty12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Lepa Brena @Sunny Beach 25 3500

        String input = scanner.nextLine();

        String regex = "^(?<singer>.+ ){1,3}@(?<venue>\\w+[^0-9]+ ){1,3}(?<price>\\d+) (?<count>\\d+)";

        Pattern pattern = Pattern.compile(regex);

        Map<String, Map<String, Integer>> statistics = new LinkedHashMap<>();
        while (!"End".equals(input)) {

            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {

                String singer = matcher.group("singer").trim();
                String venue = matcher.group("venue").trim();
                int price = Integer.parseInt(matcher.group("price").trim());
                int count = Integer.parseInt(matcher.group("count").trim());

                if (!statistics.containsKey(venue)) {
                    statistics.put(venue, new LinkedHashMap<>());

                }
                    if (!statistics.get(venue).containsKey(singer)) {
                        statistics.get(venue).put(singer, 0);
                    }
                int profit = statistics.get(venue).get(singer) + price * count;
                statistics.get(venue).put(singer, profit);
            }


            input = scanner.nextLine();

        }

        statistics.entrySet()
                .stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().entrySet().stream()
                            .sorted((a,b)->b.getValue()-a.getValue())
                            .forEach(innerEntry ->{
                                System.out.println
                                        (String.format("#  %s -> %d", innerEntry.getKey(),innerEntry.getValue()));
                            });

                });



    }
}
