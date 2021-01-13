package basicsyntaxandsimpleprograms.arrays.IteratingOverArrays;

import java.util.Scanner;

/**
 * A program that calculates the sum of the elements of an array of ints.
 * 
 * Input data format:
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 * 
 * Output data format:
 * The sum of the input array elements. 
 *
 * @author (Ruari Mears)
 * @version (12.11.2020)
 */
class TheSumOfArrayElements {
    /* easy (non-array) method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int sumOfInts = 0;
        
        for (int i = 0; i < arrayLength; i++) {
            sumOfInts = sumOfInts + scanner.nextInt();
        }
                
        System.out.println(sumOfInts);
    }
    */
   
    // more robust array method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] valuesToSum = new int[arrayLength];
        int sumOfInts = 0;
                
        for (int i = 0; i < valuesToSum.length; i++) {
            valuesToSum[i] = scanner.nextInt();
            sumOfInts = sumOfInts + valuesToSum[i];
        }
        
        System.out.println(sumOfInts);
    }
}