package StreamsFilesDirecories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        FileOutputStream outputStream = new FileOutputStream("output11.txt");

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

        Files.readAllLines(Path.of(path))
                .forEach(str -> {
                    try {
                        writer.write(str.toUpperCase());
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        writer.close();


    }
}
