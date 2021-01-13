package basicsyntaxandsimpleprograms.arrays.MultiDimensionalArrays;

import java.util.*;

/**
 * N-size Sudoku is a game with a square table of N^2 width and height divided into N^2 smaller squares of 
 * N width and height. In a solved state, each of these smaller squares, as well as each row and column of a 
 * full square, contains all numbers from 1 to N^2 without repetition.
 * 
 * Given a number N on the first line and a full sudoku table on the next N^2 lines. Every line contains N2 
 * integers.
 * 
 * Your task is to determine whether this sudoku is solved or not. Output "YES" if this sudoku table is solved, 
 * otherwise "NO".
 * 
 * N can be from 1 to 10.
 *
 * @author (Ruari Mears)
 * @version (23.11.2020)
 */
public class CheckSudoku
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixDimension = scanner.nextInt();
        int[][] sudoku = new int[matrixDimension][matrixDimension];
        String solved = "YES";
        
        /**
         * 3 Keys to pass this test
         * - sumcolum += sudoku[i][j]
         * - sumrow += sudoku[j][i]
         * - Symmetric method
         */
        
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                sudoku[i][j] = scanner.nextInt();
            }
        }
        
        // check rows
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                int sumOfRow = 0;
                sumOfRow += sudoku[j][i];
                if (sumOfRow != (matrixDimension * (matrixDimension + 1)) / 2) {
                    solved = "NO";
                    break;
                }
                int sumOfColumn = 0;
                sumOfColumn += sudoku[i][j];
                if (sumOfColumn != (matrixDimension * (matrixDimension + 1)) / 2) {
                    solved = "NO";
                    break;
                }
            }
        }
        
        System.out.println(solved);
    }
}
