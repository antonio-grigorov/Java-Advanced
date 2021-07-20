package MultidimensionalArrays;

import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(readMatrixSize(scanner));

        int[][] matrix = readMatrix(scanner, matrixSize);

        printFirstDiagonal(matrix, matrixSize);
        System.out.println();
        printSecondDiagonal(matrix, matrixSize);

    }

    private static void printSecondDiagonal(int[][] matrix, int matrixSize) {
        int col=0;
        for (int row = matrix.length-1; row >=0 ; row--) {
            System.out.print(matrix[row][col]+" ");
            col++;
        }

    }

    private static void printFirstDiagonal(int[][] matrix, int matrixSize) {
        for (int row = 0; row < matrix.length; row++) {
            System.out.print(matrix[row][row] + " ");
        }

    }

    private static int[][] readMatrix(Scanner scanner, int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int row = 0; row < matrixSize; row++) {
            String currentCol = scanner.nextLine();
            String[] rowsNumbers = currentCol.split("\\s+");
            for (int col = 0; col < matrixSize; col++) {
                matrix[row][col] = Integer.parseInt(rowsNumbers[col]);
            }
        }
        return matrix;
    }

    private static String readMatrixSize(Scanner scanner) {
        return scanner.nextLine();
    }
}
