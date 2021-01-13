package basicsyntaxandsimpleprograms.controlflowstatements.theforloop;

import java.util.Scanner;

/**
 * Write a description of class FizzBuzz here.
 *
 * @author (Ruari Mears)
 * @version (05.10.2020)
 */
public class FizzBuzz {
    // instance variables - replace the example below with your own
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}