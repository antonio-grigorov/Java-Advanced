package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = readMatrix(scanner, rows, cols);

        int maxSum = Integer.MIN_VALUE;

        int indexRow = 0;
        int indexCol = 0;

        for (int row = 1; row < rows - 1; row++) {
            for (int col = 1; col < cols - 1; col++) {
                int sum = calculateMatrixSum(matrix, row, col);
                if (sum > maxSum) {
                    maxSum = sum;
                    indexRow = row;
                    indexCol = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);

        printMaxSubMatrix(matrix, indexRow, indexCol);
    }

    private static void printMaxSubMatrix(int[][] matrix, int indexRow, int indexCol) {
        for (int row = indexRow - 1; row <= indexRow + 1; row++) {
            for (int col = indexCol - 1; col <= indexCol + 1; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();

        }

    }

    private static int calculateMatrixSum(int[][] matrix, int centerRow, int centerCol) {
        int sum = 0;
        for (int row = centerRow - 1; row <= centerRow + 1; row++) {
            for (int col = centerCol - 1; col <= centerCol + 1; col++) {
                sum += matrix[row][col];
            }

        }
        return sum;
    }

    private static int[][] readMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String currentCol = scanner.nextLine();
            String[] rowsNumbers = currentCol.split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(rowsNumbers[col]);
            }
        }
        return matrix;
    }
}
