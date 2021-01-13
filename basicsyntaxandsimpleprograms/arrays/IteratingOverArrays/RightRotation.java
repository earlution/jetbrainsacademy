package basicsyntaxandsimpleprograms.arrays.IteratingOverArrays;

import java.util.Scanner;

/**
 * A right rotation is an operation that shifts each element of an array to 
 * the right. For example, if an array is {1,2,3,4,5} and we right rotate it 
 * by 1, the new array will be {5,1,2,3,4}. If we rotate it by 2, the new 
 * array will be {4,5,1,2,3}. 
 * It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.
 * 
 * Write a program that performs a right rotation on an array by a given 
 * number.
 * 
 * Input format:
 * The first line is an array of numbers.
 * The second line is the number of rotations.
 * 
 * Output format:
 * Resulting array
 *
 * @author (Ruari Mears)
 * @version (16.11.2020)
 */
public class RightRotation
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringValues = scanner.nextLine().split(" ");
        int rotation = scanner.nextInt() % stringValues.length; 
        //so the rotation < values.length and this prevent unnessesary rotations
        int[] values = new int[stringValues.length];
        String output = "";
        
        // perform rotation, with explicit String to int casting
        for (int i = 0; i < values.length; i++) {
            values[(i + rotation) % values.length] = Integer.parseInt(stringValues[i]);
        } 
              
        // generate output String
        for (int value : values) {
            output = output + value + " ";
        }
        
        System.out.println(output.trim()); // trim() removes leading & trailing whitespace
    }
}
