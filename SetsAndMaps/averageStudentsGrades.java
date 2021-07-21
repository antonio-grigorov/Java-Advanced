package SetsAndMaps;

import java.util.*;

public class averageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGrades = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String student = input[0];
            Double grade = Double.parseDouble(input[1]);


            studentsGrades.putIfAbsent(student, new ArrayList<>());
            studentsGrades.get(student).add(grade);

        }
//Ivancho -> 5.20 3.20 (avg: 4.20)

        studentsGrades.entrySet().stream().forEach(entry ->
        {
            double sum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i);
            }
            double avgSum = sum / entry.getValue().size();

            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(
                    e -> System.out.printf("%.2f ",e));
            System.out.printf("(avg: %.2f)%n", avgSum);

        });


    }
}
