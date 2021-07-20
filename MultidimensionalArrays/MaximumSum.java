package MultidimensionalArrays;

import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String input=scanner.nextLine();
        String[] tokens=input.split(",\\s+");
        int rows=Integer.parseInt(tokens[0]);
        int cols=Integer.parseInt(tokens[1]);

        int[][] matrix=readMatrix(scanner,rows, cols);
        int maxSum=0;
        int maxRow=0;
        int maxCol=0;
        for (int row = 0; row < rows-1; row++) {
            for (int col = 0; col <cols-1 ; col++) {
                int sum=matrix[row][col]+
                        matrix[row+1][col+1]
                        +matrix[row][col+1]
                        +matrix[row+1][col];
                if(sum>maxSum){
                    maxSum=sum;
                    maxRow=row;
                    maxCol=col;
                }

            }
        }
        printResult(matrix,maxRow,maxCol);
        System.out.println(maxSum);




    }

    private static void printResult(int[][] matrix, int maxRow, int maxCol) {
        for (int row = maxRow; row< maxRow+2 ; row++) {
            for (int col = maxCol; col <maxCol+2 ; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }


    private static int[][] readMatrix(Scanner scanner, int rows, int cols) {
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
