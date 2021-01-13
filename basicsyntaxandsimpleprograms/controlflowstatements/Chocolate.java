package basicsyntaxandsimpleprograms.controlflowstatements;

import java.util.Scanner;

/**
 * Write a description of class Chocolate here.
 *
 * @author (Ruari Mears with help from https://bit.ly/3j9JaME)
 * @version (28.09.2020)
 */
public class Chocolate
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if (k >= m * n) {
            System.out.print("NO"); // ensure cut is not bigger than bar
        } else if (k % n == 0 && k >= n || k % m == 0 && k >= m) {
            System.out.print("YES");
        } else {
            System.out.print("NO"); 
        }
    }
}
