package basicsyntaxandsimpleprograms.controlflowstatements.theforloop;

import java.util.Scanner;

/**
 * Given a sequence of natural numbers, not exceeding 30000. Find the maximum
 * element divisible by 4. There is always an element divisible by 4 in the
 * sequence and the number of elements does not exceed 1000.
 * 
 * As input, the program receives the number of elements in the sequence n 
 * (first line) and then the elements themselves (next n lines). The program 
 * should print a single number: the maximum element of the sequence 
 * divisible by 4.
 *
 * @author (Ruari Mears)
 * @version (12.10.2020)
 */
public class MaximumElementDivisibleByFour {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt();
        int[] elements = new int[numOfElements];
        int maxElement = 0;
        
        // populate the array of elements
        for (int i = 0; i < numOfElements; i++) {
            elements[i] = scanner.nextInt();
        }
        
        // ascertain the the maximum element of the sequence divisible by 4
        // replace testData with elements to use inputted data
        for (int i = 0; i < numOfElements; i++) {
            if (elements[i] % 4 == 0 && elements[i] > maxElement) {
                maxElement = elements[i];
            }
        }
        
        System.out.println(maxElement);
    }    
}
