package basicsyntaxandsimpleprograms.controlflowstatements.branchingstatements;

import java.util.Scanner;

/**
 * Given a sequence of natural numbers. For each number of the sequence output 
 * "even" if the number is even, otherwise, "odd". If the number is equal to 0, 
 * the program must stop reading and processing numbers.
 * 
 * Input data:
 * 
 * A sequence of natural numbers, each number in a new line.
 * 
 * Output data:
 * 
 * The sequence of words "even" and "odd". Each word in a new line.
 * 
 * The program must output the result right after the number is entered. 
 * Then input the next one. There's no need to store the sequence.
 *
 * @author (Ruari Mears)
 * @version (15.10.2020)
 */
public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = -1;

        while (input != 0) {
            input = scanner.nextInt();

            if (input % 2 == 0) {
                if (input == 0) {
                    continue;
                }
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } 
    }
}
