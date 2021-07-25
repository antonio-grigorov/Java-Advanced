package StreamsFilesDirecories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class CounterCharacterTypes {

    public static int[] counts = new int[]{0,0,0};

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        PrintWriter writer = new PrintWriter("outputCount.txt");

        Scanner scanner = new Scanner(new File(path));

        String vowels = "aeiou";
        String punctuations = "!,.?";

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            Arrays.stream(line.split("\\s+"))
                    .forEach(str -> {
                        for (char symbol : str.toCharArray()) {
                            String currentString = String.valueOf(symbol);
                            if (vowels.contains(String.valueOf(symbol))) {
                                counts[0]++;

                            } else if (punctuations.contains(currentString)) {
                                counts[2]++;
                            } else {
                                counts[1]++;
                            }
                        }
                    });


        }
        writer.printf("Vowels: %d%n", counts[0]);
        writer.printf("Consonants: %d%n", counts[1]);
        writer.printf("Punctuation: %d%n", counts[2]);
        writer.close();
    }
}
