package basicsyntaxandsimpleprograms.controlflowstatements.branchingstatements;

import java.util.Scanner;

/**
 * Write a program that reads a sequence of integer numbers in a loop and adds 
 * up all numbers. If a new number is equal to 0, the program must stop the 
 * loop and output the accumulated sum. When the sum is equal or exceeded 1000 
 * (the barrier), the program should also stop and output the value equal to 
 * sum – 1000.
 * 
 * Note, the input can contain extra numbers. Just ignore them.
 *
 * @author (Ruari Mears)
 * @version (15.10.2020)
 */
public class TheIntegerBarrier {

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        int sum = 0;
        
        while (input != 0) {
            input = scanner.nextInt();
            sum = sum + input;
            
            if (sum >= 1000) {
                break;
            }
        }
        
        if ((sum - 1000) < 0) {
            System.out.println(sum);
        } else {
            System.out.println(sum - 1000);
        }
    }
}
