package src.OOP.ReflectionAndAnnotations.HarvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Field[] fields = RichSoilLand.class.getDeclaredFields();

        StringBuilder builder = new StringBuilder();
        while (!"HARVEST".equals(input)) {

                for (Field field : fields) {
                    int modifiers = field.getModifiers();
                    String modifierAsString=Modifier.toString(modifiers);
                    if (modifierAsString.equals(input) || input.equals("all")) {
                        builder.append(String.format("%s %s %s%n",
                                modifierAsString,
                                field.getType().getSimpleName(),
                                field.getName()
                        ));
                    }
                }

            input = scanner.nextLine();

        }
        System.out.println(builder.toString());
    }
}

