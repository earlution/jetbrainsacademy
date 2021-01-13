package basicsyntaxandsimpleprograms.controlflowstatements.theforloop;

import java.util.Scanner;

/**
 * A program that reads a, b, n and outputs the count of numbers divisible by n
 * in the range from a to b (a < b) inclusively.
 *
 * @author (Ruari Mears)
 * @version (12.10.2020)
 */
public class TheCountOfNumbersDivisibleByN {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0; // not required for the no-iteration solution
        
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count++;
            }
        }
        
        /**
         * No-iteration solution (from a Jetbrains academy student)
         * double count = (b - a) / n;
         * System.out.println(Math.round(a > 0 && a % n == 0 ? ++count : count));
         */
        
        System.out.println(count);            
    }
}
