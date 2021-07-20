package MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] firstMatrix = readMatrix(scanner, rows, cols);
        char[][] secondMatrix = readMatrix(scanner, rows, cols);

        char[][] result = new char[rows][cols];

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    result[row][col] = firstMatrix[row][col];
                } else {
                    result[row][col] = '*';
                }


            }
        }

        print(result);
    }

    public static void print(char[][] result) {
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();


        }
    }

    private static char[][] readMatrix(Scanner scanner, int rows, int cols) {

        char[][] matrix=new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String[] tokens = line.split("\\s+");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = tokens[col].charAt(0);
            }
        }

        return matrix;
    }
}
