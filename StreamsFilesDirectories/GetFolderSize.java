package StreamsFilesDirecories;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        String path = "C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File file = new File(path);
        long size = 0;

        for (File innerFile : file.listFiles()) {
            size += innerFile.length();
        }
        System.out.println("Folder size: " +size);
    }
}
