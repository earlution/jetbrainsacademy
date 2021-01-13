package basicsyntaxandsimpleprograms.arrays.IteratingOverArrays;

import java.util.Scanner;

/**
 * Write a program that reads an array of ints and finds the index of the 
 * first maximum in an array. 
 * 
 * Input data format:
 * The first line contains the number of elements in the array. 
 * The second line contains the array elements separated by spaces. 
 * An array always has at least one element.
 * 
 * Output data format:
 * Only a single integer value: the index of the first maximum.
 * 
 * Sample Input 1:
 * 5
 * 2 5 3 4 5
 * 
 * Sample Output 1:
 * 1
 * 
 * Sample Input 2:
 * 6
 * 1000 10 1000 10 10 1001
 * 
 * Sample Output 2:
 * 5
 *
 * @author (Ruari Mears)
 * @version (13.11.2020)
 */

public class TheIndexOfTheFirstMaxInAnArray
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] values = new int[arrayLength];
        int maxValue = 0;
        int indexOfMaxValue = 0;

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
                indexOfMaxValue = i;
            }
        }
        
        System.out.println(indexOfMaxValue);
    }
}
