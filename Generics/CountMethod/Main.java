package src.Generics.CountMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Box<String> box = new Box<>();

        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String text=scanner.nextLine();
            box.add(text);
        }

        String element=scanner.nextLine();

        System.out.println(box.countGreaterThan(element));


    }
}
