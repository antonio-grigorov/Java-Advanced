package MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(trimmedLineSkippingBlankLines(scanner));
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readCharMatrix(scanner, rows);
        char[][] secondMatrix = readCharMatrix(scanner, rows);

        char[][] answer = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    answer[row][col] = firstMatrix[row][col];
                } else {
                    answer[row][col] = '*';
                }
            }
        }
        printCharMatrix(answer);
    }

    private static String trimmedLineSkippingBlankLines(Scanner scanner) {

        String line = scanner.nextLine();
        while (line.length() == 0) {
            line = scanner.nextLine().trim();
        }
        return line;
    }


    private static char[][] readCharMatrix(Scanner scanner, int rows) {
        char[][] matrix = new char[rows][];
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String strippedString = line.replaceAll("\\s+", "");
            matrix[row] = strippedString.toCharArray();
        }
        return matrix;
    }

    private static void printCharMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        String line = scanner.nextLine();
        String[] tokens = line.split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        return matrix;
    }

}