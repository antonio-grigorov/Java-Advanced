package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        Map<String, Integer> treasure=new LinkedHashMap<>();

        String resource=scanner.nextLine();


        while(!"stop".equals(resource)){
            int quantity=Integer.parseInt(scanner.nextLine());

            treasure.putIfAbsent(resource,0);
            int currentQuantity=treasure.get(resource);
            treasure.put(resource,currentQuantity+quantity);
            resource=scanner.nextLine();
        }
        treasure.entrySet().stream()
                .forEach(e-> System.out.println(String.format("%s -> %d", e.getKey(),e.getValue())));
    }
}
