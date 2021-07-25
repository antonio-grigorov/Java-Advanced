package StreamsFilesDirecories;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Files-and-Streams-Lab-Resources\\input.txt";
        String output = "output4.txt";
        FileInputStream fileInputStream =
                new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(output);

        Scanner scanner = new Scanner(fileInputStream);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int oneInt = scanner.nextInt();
                printWriter.println(oneInt);
                printWriter.flush();
            } else {
                scanner.next();
            }

        }
            printWriter.close();
        scanner.close();

    }
}
