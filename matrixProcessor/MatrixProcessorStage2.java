package matrixProcessor;

import java.util.Scanner;

/**
 * Write a program that:
 * 
 * 1. reads a matrix and a constant,
 * 2. outputs the result of their multiplication.
 * 
 * The first line of the input contains the number of rows and the number of columns of the matrix. The next 
 * lines contain rows of the matrix. The last line contains the constant.
 * 
 * The constant and the elements of the matrix are integers.
 * 
 * Example 1:
 * Input:
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 3
 * 
 * Output:
 * 3 6 9
 * 12 15 18
 * 21 24 27
 * 
 * Example 2:
 * Input:
 * 2 3
 * 1 2 3
 * 4 5 6
 * 0
 * 
 * Output:
 * 0 0 0
 * 0 0 0
 *  *
 * @author (Ruari Mears)
 * @version (07/12/2020)
 */
public class MatrixProcessorStage2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixARows = scanner.nextInt();
        int matrixAColumns = scanner.nextInt();
        int[][] matrixA = new int[matrixARows][matrixAColumns];

        //capture values for matrix A
        for (int i = 0; i < matrixARows; i++) {
            for (int j = 0; j < matrixAColumns; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        
        int matrixConstant = scanner.nextInt();    
        String[] output = new String[matrixARows];
        
        int[][] matrixOutput = new int[matrixARows][matrixAColumns];

        for (int i = 0; i < matrixARows; i++) {
            String matrixRow = "";
            for (int j = 0; j < matrixAColumns; j++) {
                matrixOutput[i][j] = matrixA[i][j] * matrixConstant;
                matrixRow = matrixRow + Integer.toString(matrixOutput[i][j]) + " ";
            }
            output[i] = matrixRow;
        }

        //output
        for (String line : output) {
            System.out.println(line.trim()); // trim() removes leading & trailing whitespace
        }
    }
}
