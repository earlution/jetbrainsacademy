package basicsyntaxandsimpleprograms.controlflowstatements;

import java.util.Scanner;

/**
 * Given a four-digit number. Determine whether its decimal notation is
 * symmetric. If the number is symmetric, output 1; otherwise output any other
 * integer.
 *
 * @author (Ruari Mears)
 * @version (28.09.2020)
 */
public class SymmetricalNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastDigit = 0;
        int reversedNum = 0;
        int input = scanner.nextInt();

        while (input != 0) {
            lastDigit = input % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            input = input / 10;
        }
        
        if (input == reversedNum) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
