package basicsyntaxandsimpleprograms.controlflowstatements.thewhileanddowhileloops;

import java.util.Scanner;

/**
 * Find the sum of all elements of a sequence, ending with the number 0.
 * 
 * The number 0 itself is not included into the sequence and serves as a sign
 *  of cessation.
 *
 * @author (Ruari Mears)
 * @version (15.10.2020)
 */
public class TheSumOfElements {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        int total = 0;
        
        while (input != 0) {
            input = scanner.nextInt();
            total = total + input;
        }
        
        System.out.println(total);
    }
}
