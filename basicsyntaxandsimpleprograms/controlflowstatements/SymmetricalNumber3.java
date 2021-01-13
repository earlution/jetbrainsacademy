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
public class SymmetricalNumber3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reverse = "";
        int input = scanner.nextInt();
        String original = Integer.toString(input);
        int success = 1;
        int boo = 2;
        int length = original.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + original.charAt(i);
        
        if (original.equals(reverse)) {
            System.out.println(success);
        } else {
            System.out.println(boo);
        }
    }
}
