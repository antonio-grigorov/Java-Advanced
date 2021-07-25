package StreamsFilesDirecories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListFiles {
    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);

        File file = new File("C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Files-and-Streams-Lab-Resources\\Files-and-Streams");



        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                        System.out.printf("%s: [%s]%n",
                                f.getName(), f.length());
                    }
                }
            }
        }

    }
}
