package src.Generics.ArrayCreator;

public class Main {
    public static void main(String[] args) {

        String[] strings = ArrayCreator.create(5, "Alice");

        String[] strings2 = ArrayCreator.create(String.class, 5, "Alice");

        for (int i = 0; i < strings2.length; i++) {
            System.out.println(strings2[i]);

        }

    }


}
