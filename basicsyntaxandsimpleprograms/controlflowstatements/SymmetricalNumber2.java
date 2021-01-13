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
public class SymmetricalNumber2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int length = (int) (Math.log10(input) + 1);
        int a = input / 1000;
        int b = input / 100 % 10;
        int c = input / 10 % 10;
        int d = input % 10;
        
        if (length == 4 && a == d && b == c) {
            System.out.println("1");
        } else if (length == 3 && b == d) {
            System.out.println("1");
        } else {
            System.out.println(input + 1);
        }
    }
}
