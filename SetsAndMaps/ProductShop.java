package SetsAndMaps;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        Map<String, Map<String, Double>> shopProductsPrices = new TreeMap<>();


        while (!"Revision".equals(input)) {
            String[] tokens = input.split(",\\s+");
            String shop = tokens[0];
            String product = tokens[1];
            Double price = Double.parseDouble(tokens[2]);

            shopProductsPrices.putIfAbsent(shop, new LinkedHashMap<>());
            shopProductsPrices.get(shop).put(product, price);


            input = scanner.nextLine();
        }
        //Product: apple, Price: 1.2
        shopProductsPrices.forEach((key,value)->{
            System.out.println(String.format("%s->",key));
            value.forEach((k,v)->{
                System.out.println(String.format("Product: %s, Price: %.1f",k,v));


            });

        });



    }
}