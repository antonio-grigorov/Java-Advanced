package StreamsFilesDirecories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Files-and-Streams-Lab-Resources\\input.txt";
        String output3 = "output3.txt";
        FileInputStream fileInputStream =
                new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(output3);

        int space = ' ';
        int newline = '\n';

        int oneByte = fileInputStream.read();
        while (oneByte != -1) {
            String stringNumber = String.valueOf(oneByte);

            if (oneByte == space || oneByte == newline) {
                fileOutputStream.write(oneByte);
            } else {
                for (int i = 0; i < stringNumber.length(); i++) {

                    fileOutputStream.write(stringNumber.charAt(i));
                }}
                oneByte = fileInputStream.read();
            }

    }
}
