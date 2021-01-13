package basicsyntaxandsimpleprograms.arrays.MultiDimensionalArrays;

import java.util.Scanner;

/**
 * Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by recording the result into the new 
 * array m×n in size.
 * 
 * Input data format:
 * Input the two numbers n and m, not exceeding 100, and then an array n×m in size.
 * 
 * Output data format:
 * Output the resulting array. Separate numbers by a single space in the output.
 * 
 * Sample Input 1:
 * 3 4
 * 11 12 13 14
 * 21 22 23 24
 * 31 32 33 34
 * 
 * Sample Output 1:
 * 31 21 11 
 * 32 22 12 
 * 33 23 13 
 * 34 24 14
 *
 * @author (Ruari Mears)
 * @version (10.11.2020)
 */
public class RotateARectangleArray
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLengthN = scanner.nextInt();
        int arrayLengthM = scanner.nextInt();
        int[][] inputMatrix = new int[arrayLengthN][arrayLengthM];
        int[][] rotatedMatrix = new int[arrayLengthM][arrayLengthN];
        String[] output = new String[arrayLengthM];
        
        //capture values for matrix to be rotated
        for (int i = 0; i < arrayLengthN; i++) {
            for (int j = 0; j < arrayLengthM; j++) {
                inputMatrix[i][j] = scanner.nextInt();
            }
        }
        
        //rotate matrix
        for (int i = 0; i < arrayLengthM; i++) {
            String outputStr = "";
            for (int j = arrayLengthN - 1; j >= 0; j--) {
                rotatedMatrix[i][j] = inputMatrix[j][i];
                outputStr = outputStr + rotatedMatrix[i][j] + " ";
            }
            output[i] = outputStr;
        }

        for (String line : output) {
            System.out.println(line.trim()); // trim() removes leading & trailing whitespace
        }
    }
}
