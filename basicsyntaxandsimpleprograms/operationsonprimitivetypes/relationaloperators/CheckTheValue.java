package basicsyntaxandsimpleprograms.operationsonprimitivetypes.relationaloperators;

import java.util.Scanner;

/**
 * Write a description of class CheckTheValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckTheValue
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int value = scanner.nextInt();
        
        System.out.println(value < 10 && value > 0);
    }
}
