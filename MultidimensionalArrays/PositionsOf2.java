package MultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PositionsOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);
        int specialNumber = Integer.parseInt(scanner.nextLine());

        Deque<String> answer = new ArrayDeque<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (specialNumber == matrix[row][col]) {
                    answer.offer(row + " " + col);
                }

            }
        }
        if (answer.isEmpty()) {
            System.out.println("not found");
        } else {
            while (!answer.isEmpty()) {
                System.out.println(answer.poll());
            }
        }

    }

    private static int[][] readMatrix(Scanner scanner) {
        String line = scanner.nextLine();
        String[] tokens = line.split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            line = scanner.nextLine();
            tokens = line.split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(tokens[col]);

            }
        }
        return matrix;
    }
}
