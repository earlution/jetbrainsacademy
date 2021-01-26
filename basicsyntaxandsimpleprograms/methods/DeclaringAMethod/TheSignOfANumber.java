package basicsyntaxandsimpleprograms.methods.DeclaringAMethod;


import java.util.Scanner;

/**
 * Write a description of class TheSignOfANumber here.
 *
 * @author (Ruari Mears)
 * @version (15.01.2021)
 */
public class TheSignOfANumber {
    
    public static String sign(int n) {
        String value = "";
        if (n < 0) {
            value = "-1";
        } else if (n > 0) {
            value = "+1";
        } else if (n == 0) {
            value = "0";
        } else {
            System.out.println("Unexpected error!");
        }
        return value;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
