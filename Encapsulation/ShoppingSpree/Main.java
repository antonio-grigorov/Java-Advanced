package src.OOP.Encapsulation.ShoppingSpree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(";");

        Map<String, Person> peopleByNames = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            String[] tokens = input[i].split("=");
            String name = tokens[0];
            double money = Double.parseDouble(tokens[1]);
            Person p = new Person(name, money);
            peopleByNames.putIfAbsent(name, p);
        }


        input = scanner.nextLine().split(";");

        Map<String, Product> productsByNames = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            String[] tokens = input[i].split("=");
            String name = tokens[0];
            double money = Double.parseDouble(tokens[1]);

            Product p = new Product(name, money);
            productsByNames.putIfAbsent(name, p);
        }

        String line=scanner.nextLine();
        while(!"END".equals(line)){

            String[] tokens=line.split("\\s+");
            String name=tokens[0];
            String product=tokens[1];

            try {
                peopleByNames.get(name).buyProduct(productsByNames.get(product));
                System.out.println(name + " bought "+ product);
            } catch (IllegalStateException ise){
                System.out.println(ise.getMessage());
            }

            line=scanner.nextLine();
        }

        for (Person name : peopleByNames.values()) {
            System.out.println(name);
        }

    }

}

