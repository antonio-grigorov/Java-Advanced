package MultidimensionalArrays;

import java.util.Scanner;

public class SnakeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        int[][] matrix = new int[8][32];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row % 2 == 1) {
                    matrix[row][matrix[row].length - 1 - col] = count++;

                } else {
                    matrix[row][col] = count++;
                }


            }
        }
        printMatrix(matrix);


    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+", ");
            }
            System.out.println();
        }
    }
}
