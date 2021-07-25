package StreamsFilesDirecories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class writeToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Files-and-Streams-Lab-Resources\\input.txt";
        String output = "output.txt";
        FileInputStream fileInputStream =
                new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(output);

        Set<Character> punctuation = Set.of(',', '.', '!', '?');
        int oneByte = fileInputStream.read();

        while (oneByte != -1) {
            if (!punctuation.contains((char)oneByte)) {
                fileOutputStream.write(oneByte);
            }

            oneByte = fileInputStream.read();
        }


    }
}
