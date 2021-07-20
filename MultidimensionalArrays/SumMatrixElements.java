package MultidimensionalArrays;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int[][] matrix=readMatrix(scanner);
        int count=0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                count+=matrix[row][col];
            }
        }
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(count);


    }

    private static int[][] readMatrix(Scanner scanner) {
        String input = scanner.nextLine();
        String line=input.replaceAll(",","");
        String[] tokens = line.split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col]=scanner.nextInt();
            }
        }
        return matrix;
    }
}
