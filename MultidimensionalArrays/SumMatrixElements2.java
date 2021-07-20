package MultidimensionalArrays;

import java.util.Scanner;

public class SumMatrixElements2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] tokens = input.split(",\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int count=0;
        int[][]matrix=readMatrix(scanner,rows,cols);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col <cols ; col++) {
                count+=matrix[row][col];
            }
        }

        System.out.printf("%d%n%d%n%d%n", rows,cols,count);

    }


    private static int[][] readMatrix(Scanner scanner,int rows, int cols) {

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String currentCol= scanner.nextLine();
            String[] rowsNumbers=currentCol.split(",\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col]=Integer.parseInt(rowsNumbers[col]);
            }
        }
        return matrix;
    }

}
