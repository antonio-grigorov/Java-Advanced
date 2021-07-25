package StreamsFilesDirecories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Files-and-Streams-Lab-Resources\\input.txt";
        String output = "output6.txt";

        List<String> allLines = Files.lines(Path.of(path))
                .sorted()
                .collect(Collectors.toList());
        Files.write(Path.of(output),allLines);

    }
}
