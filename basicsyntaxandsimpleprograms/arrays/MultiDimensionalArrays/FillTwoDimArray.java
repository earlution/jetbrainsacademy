package basicsyntaxandsimpleprograms.arrays.MultiDimensionalArrays;

import java.util.Arrays;

/**
 * You can create an array with more than 2 dimensional (3-dim, 4-dim, 5-dim and so on).
 * 
 * Let's create 3-dimensional array of integers:
 * 
 * int[][][] cubic = new int[3][4][5];
 * 
 * Actually, this cubic array is represented as three 2-dimensional arrays 4x5.
 * 
 * Let's fill each 2D array of the cubic by the following rules:
 *  - the first 2D array must contain elements equal 1;
 *  - the second 2D array must contain elements equal 2;
 *  - the third 2D array must contain elements equal 3.
 *  
 * The classic way to do that is to use three for loops: one outer loop and two nested.
 *
 * @author (JetBrains Academy)
 */
public class FillTwoDimArray
{
    public static void Main(String[] args) {
        int[][][] cubic = new int[3][4][5]; // a three-dimensional array (cube)    
        int current = 1; // it stores a value to fill elements
        
        // this code fills the 3-dimensional array
        for (int[][] dim2Array : cubic) {     // for each 2-dim array
            for (int[] vector : dim2Array) {  // for each 1-dim array (vector) of 2-dim array
                Arrays.fill(vector, current); // fill the vector
            }
            current++; // the next current
        }

        // print all 2-dimensional arrays
        for (int[][] dim2Array : cubic) {
            for (int[] vector : dim2Array) {
                System.out.println(Arrays.toString(vector));
            }
            System.out.println();
        }

    }
}