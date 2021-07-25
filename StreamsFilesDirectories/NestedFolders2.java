package StreamsFilesDirecories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class NestedFolders2 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File dir = new File(path);

        ArrayDeque<File> queue = new ArrayDeque<>();

        queue.push(dir);

        while (!queue.isEmpty()) {
            File currentDir = queue.poll();
            System.out.println(currentDir.getName());
            File[] files = currentDir.listFiles();

            for (File file : files) {
                if (file.isDirectory()){
                    queue.offer(file);
                }

            }
        }
    }
}
