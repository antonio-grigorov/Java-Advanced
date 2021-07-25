package StreamsFilesDirecories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        Files.readAllLines(Path.of(path))
                .stream()
                .map(String::toCharArray)
                .forEach(c->{
                    int bytes=0;
                    for (char symbol : c) {
                        bytes+=symbol;
                    }
                    System.out.println(bytes);
                });



    }
}
