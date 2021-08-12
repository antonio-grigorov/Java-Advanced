package StreamsFilesDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {

        String path = "C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String output = "WordCount.txt";
        try (FileReader words = new FileReader("C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
             FileReader text = new FileReader("C:\\Users\\Antonio\\IdeaProjects\\JavaAdvanced\\Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
             BufferedReader keyWordsReader = new BufferedReader(words);
             BufferedReader textReader = new BufferedReader(text);
             PrintWriter pw = new PrintWriter(output);
        ) {
            String[] tokens = new String[100000];
            String line = keyWordsReader.readLine();
            while (line != null) {
                tokens = line.split("\\s+");
                line = keyWordsReader.readLine();
            }
            List<String> keyWords = new ArrayList<>();
            for (String keyWord : tokens) {
                keyWords.add(keyWord);
            }

            HashMap<String, Integer> wordCounter = new HashMap<>();
            for (String token : tokens) {
                wordCounter.put(token, 0);
            }

            String textLine = textReader.readLine();
            while (textLine != null) {
                String[] textTokens = textLine.split("\\s+");
                for (String textToken : textTokens) {
                    if (wordCounter.containsKey(textToken)) {
                        wordCounter.put(textToken, wordCounter.get(textToken) + 1);
                    }
                }
                textLine = textReader.readLine();
            }
            wordCounter.entrySet().stream().sorted((a,b)->b.getValue().compareTo(a.getValue()))
                    .
                    forEach(e ->
                    pw.printf(e.getKey() + " - " + e.getValue() +"\n"));

            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
