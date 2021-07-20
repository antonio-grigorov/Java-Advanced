package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] matrix= new String[rows][cols];
        char firstChar='a';
        char secondChar='a';
        char thirdChar='a';

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                    matrix[row][col]= ""+ firstChar+secondChar+thirdChar;
                    secondChar++;
            }
            firstChar++;
            secondChar=firstChar;
            thirdChar++;
        }
        printResultMatrix(matrix,rows, cols);

    }

    private static void printResultMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static void printPalindrome() {
        String result="";
        char firstChar='a';
    }
}
