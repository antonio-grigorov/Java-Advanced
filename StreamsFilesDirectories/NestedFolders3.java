package StreamsFilesDirecories;

import java.io.File;

public class NestedFolders3 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File dir = new File(path);

        traverseDir(dir, 1);
    }

    private static void traverseDir(File dir, int level) {
        String format = "";
        for (int i = 0; i < level; i++) {
            format += "=";
        }
        System.out.println(format + ">" + dir.getName());
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                traverseDir(file, level + 1);
            } else {
                System.out.println(format + ">" + file.getName());
            }
        }
    }
}
