package basicsyntaxandsimpleprograms.controlflowstatements.thewhileanddowhileloops;

import java.util.Scanner;

/**
 * For its input, the program gets a sequence of non-negative integers; each
 * integer is written in a separate line. The sequence ends with an integer 0;
 * when the program reads 0, it should end its work and output the length of
 * the sequence (not counting the final 0).
 * 
 * Don’t read numbers following the number 0.
 *
 * @author (Ruari Mears)
 * @version (12.10.2020)
 */
public class TheLengthOfTheSequence {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int lastNum = -1;
                
        while (lastNum != 0) {
            lastNum = scanner.nextInt();
            count++;
        }
        
        System.out.println(count - 1);
        
    }    
}