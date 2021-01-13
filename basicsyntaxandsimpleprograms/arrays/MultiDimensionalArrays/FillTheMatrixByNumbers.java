package basicsyntaxandsimpleprograms.arrays.MultiDimensionalArrays;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

/**
 * Given the number n, not greater than 100, create the matrix of size n×n and fill it using 
 * the following rule. Numbers 0 should be stored on the primary (main) diagonal. The two 
 * diagonals, adjacent to the primary one, should contain numbers 1. The next two diagonals 
 * should contain numbers 2; etc.
 * 
 * Note: the primary diagonal runs from the top left corner to the bottom right corner.
 *
 * @author (Ruari Mears)
 * @version (23.11.2020)
 */
public class FillTheMatrixByNumbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[][] twoDimArray = new int[arrayLength][arrayLength];
        String[] output = new String[arrayLength];
        
        for (int i = 0; i < arrayLength; i++) { // iterating through each 1D array ("vector") array of a "matrix"
            String outputStr = "";
            for (int j = 0; j < arrayLength; j++) { // iterating through each element of a vector
                twoDimArray[i][j] = Math.abs(j - i); // assign a value to an element
                outputStr = outputStr + String.valueOf(Math.abs(j - i)) + " "; // append value to output string
            }
            output[i] = outputStr;
        } 
        
        for (String line : output) {
            System.out.println(line.trim()); // trim() removes leading & trailing whitespace
        }
        
        // rotates each vector by 1
        // int current = 0; // it stores a value to fill elements
        // for (int i = 0; i < arrayLength; i++) { // iterating through each 1D array ("vector") array of a "matrix"
            // for (int j = 0; j < arrayLength; j++) { // iterating through each element of a vector
                // twoDimArray[i][j] = current % arrayLength; // assign a value to an element
                // current++;
            // }
            // current--;
        // } 
    }
}
