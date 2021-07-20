package MultidimensionalArrays;

import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        if (firstMatrix.length != secondMatrix.length
                || firstMatrix[0].length != secondMatrix[0].length) {
            System.out.println("not equal");
            return;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    System.out.println("not equal");
                    return;
                }


            }
        }
        System.out.println("equal");

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
