package basicsyntaxandsimpleprograms.controlflowstatements;

import java.util.Scanner;

/**
 * Given a four-digit number. Determine whether its decimal notation is
 * symmetric. If the number is symmetric, output 1; otherwise output any other
 * integer.
 *
 * @author (stack overflow contributor - https://bit.ly/3iaUsPt)
 * @version (28.09.2020)
 */
public class SymmetricalNumberRecursive
{
    static int revNum = 0; 
    static int basePos = 1;
    static Scanner scanner = new Scanner(System.in);

    static int reversDigits(int num) { 
        if(num > 0) { 
            reversDigits(num / 10); 
            revNum += (num % 10) * basePos; 
            basePos *= 10; 
        } 
        return revNum; 
    } 

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        int reversedNum = reversDigits(input);
        
        if (input == reversedNum) {
            System.out.println("1");
        } else {
            System.out.println(input + 1);
        }
    }
}
