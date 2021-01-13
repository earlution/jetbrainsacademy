package basicsyntaxandsimpleprograms.controlflowstatements.switchstatement;

import java.util.Scanner;

/**
 * Harry Potter needs help identifying what each house means.
 * 
 * Read a string representing a house and output the following:
 * 
 * if it is "gryffindor", output "bravery";
 * if it is "hufflepuff", output "loyalty";
 * if it is "slytherin", output "cunning";
 * if it is "ravenclaw", output "intellect";
 * otherwise, output "not a valid house".
 * 
 * The problem was taken from the course Introduction to JavaScript and React by Ken McGrady 
 * and adapted for our educational platform.
 * 
 * Sample Input 1:
 * gryffindor
 * 
 * Sample Output 1:
 * bravery
 *
 * @author (Ruari Mears)
 * @version (12.01.21)
 */

public class HarryPotter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String house = scan.next();
        String quality = ""; 
        
        switch (house) {            
            case "gryffindor":
                quality = "bravery";
                break;
            case "hufflepuff":
                quality = "loyalty";
                break;
            case "slytherin":
                quality = "cunning";
                break;
            case "ravenclaw":
                quality = "intellect";
                break;
            default:
                quality = "not a valid house";
                break;
        }
        
        System.out.println(quality);
    }
}
