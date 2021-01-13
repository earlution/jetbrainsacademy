package basicsyntaxandsimpleprograms.arrays.MultiDimensionalArrays;

import java.util.Scanner;

/**
 * Given the number n, not exceeding 10, and a matrix of size n × n.
 * 
 * Check whether this matrix is symmetric in relation to the main diagonal. Output the word “YES”, 
 * if it is symmetric and the word “NO” otherwise.
 * 
 * Sample Input 1:
 * 3
 * 0 1 2
 * 1 2 3
 * 2 3 4
 * 
 * Sample Output 1:
 * YES
 *
 * @author (Ruari Mears)
 * @version (23.11.2020)
 */
public class SymmetricMatrix
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[][] matrix = new int[arrayLength][arrayLength];
        String symmetry = "YES";

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetry = "NO";
                    break;
                }
            }
        }

        System.out.println(symmetry);
    }
}
