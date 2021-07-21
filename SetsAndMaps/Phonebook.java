package SetsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Map<String, String> phonebook=new HashMap<>();

        String input=scanner.nextLine();

        while(!"search".equals(input)){
            String[] tokens=input.split("-");
            String name=tokens[0];
            String number=tokens[1];
            phonebook.put(name,number);




            input=scanner.nextLine();
        }
        String name=scanner.nextLine();
        while(!"stop".equals(name)){
                if(phonebook.containsKey(name)){
                    System.out.println(String.format("%s -> %s",name ,phonebook.get(name)));
                }
                else {
                    System.out.println(String.format("Contact %s does not exist.", name));
                }


            name=scanner.nextLine();
        }
    }
}
