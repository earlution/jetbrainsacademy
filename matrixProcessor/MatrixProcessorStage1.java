package matrixProcessor;

import java.util.Scanner;

/**
 * Write a program that:
 * 
 * 1. Reads matrix AA from the input.
 * 2. Reads matrix BB from the input.
 * 3. Outputs their sum if it is possible to add them. Otherwise, it should output the ERROR message.
 * 
 * Each matrix in the input is given in the following way: the first line contains the number of rows n and 
 * the number of columns m. Then n lines follow, each containing m integers representing one row of the matrix.
 * 
 * Output the result in the same way but don't print the dimensions of the matrix.
 * 
 * Example 1:
 * 
 * Input:
 * 4 5
 * 1 2 3 4 5
 * 3 2 3 2 1
 * 8 0 9 9 1
 * 1 3 4 5 6
 * 4 5
 * 1 1 4 4 5
 * 4 4 5 7 8
 * 1 2 3 9 8
 * 1 0 0 0 1
 * 
 * Output:
 * 2 3 7 8 10
 * 7 6 8 9 9
 * 9 2 12 18 9
 * 2 3 4 5 7
 * 
 * Example 2:
 * 
 * Input:
 * 2 3
 * 1 4 5
 * 4 5 5
 * 4 5
 * 0 1 0 4 5
 * 1 7 8 9 4
 * 1 2 3 5 6
 * 1 3 4 3 8
 * 
 * Output:
 * ERROR
 *
 * @author (Ruari Mears)
 * @version (31/11/2020)
 */
public class MatrixProcessorStage1
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
        
        int matrixBRows = scanner.nextInt();
        int matrixBColumns = scanner.nextInt();
        int[][] matrixB = new int[matrixBRows][matrixBColumns];
        
        //capture values for matrix B
        for (int i = 0; i < matrixBRows; i++) {
            for (int j = 0; j < matrixBColumns; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        
        String[] output = new String[matrixARows];
        
        if (matrixARows != matrixBRows && matrixAColumns != matrixBColumns) {
            System.out.println("ERROR"); 
        } else {
            int[][] matrixOutput = new int[matrixARows][matrixAColumns];

            for (int i = 0; i < matrixARows; i++) {
                String matrixRow = "";
                for (int j = 0; j < matrixAColumns; j++) {
                    matrixOutput[i][j] = matrixA[i][j] + matrixB[i][j];
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
}
