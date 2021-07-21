package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, Double> graduationGrades = new TreeMap<>();
        for (int i = 0; i < number; i++) {
            String name = scanner.nextLine();
            String studentGrades = scanner.nextLine();
            String[] tokens = studentGrades.split("\\s+");

            double averageGrade = 0;
            for (int j = 0; j < tokens.length; j++) {
                averageGrade += Double.parseDouble(tokens[j]);

            }
            averageGrade /= tokens.length;
            if(graduationGrades.containsKey(name)){
                name+="";
            }
            graduationGrades.put(name, averageGrade);

        }
        graduationGrades.entrySet().stream().forEach(e->{
            System.out.println(String.format("%s is graduated with %s",e.getKey(),e.getValue()));

        });


    }
}
