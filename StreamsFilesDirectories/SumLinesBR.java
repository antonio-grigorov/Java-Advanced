package StreamsFilesDirecories;

import java.io.*;
import java.nio.file.Path;

public class SumLinesBR {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";



        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line = reader.readLine();

        while (line!=null) {
            int sum = 0;
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
            System.out.println(sum);
            line = reader.readLine();
        }
    }
}
