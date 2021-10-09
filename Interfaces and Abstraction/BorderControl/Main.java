package src.OOP.InterfacesAndAbstraction.BorderControl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> ids = new LinkedList<>();
        String line = scanner.nextLine();

        while (!"End".equals(line)) {
            String[] tokens = line.split("\\s+");

            String id=checkId(tokens);
            ids.add(id);

            line = scanner.nextLine();
        }
        String specifiedDigits=scanner.nextLine();

            print(ids, specifiedDigits);
        }

    private static void print(List<String> ids, String specifiedDigits) {
        for (String id : ids) {
            if(id.endsWith(specifiedDigits)){
                System.out.println(id);
            }
    }

}
    private static String checkId(String[] tokens) {
        String id=null;
        if (tokens.length == 2) {
             id = tokens[1];
        } else {
             id = tokens[2];
        }
        return id;
    }
}
