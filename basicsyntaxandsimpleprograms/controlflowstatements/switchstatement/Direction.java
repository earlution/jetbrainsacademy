package basicsyntaxandsimpleprograms.controlflowstatements.switchstatement;

import java.util.Scanner;

/**
 * Write a program, which reads the number of direction 
 * (1 – up, 2 – down, 3 – left, 4 – right, 0 – do not move) 
 * and outputs the text "move up" (or "move down", or "move left", or "move right", 
 * or "do not move" depending on the entered number). If it is a number that does not belong 
 * to any of the listed directions, the program should output "error!"
 * 
 * Note: the output text should exactly match the sample, including the letters’ case and 
 * location of spaces.
 * 
 * Sample Input 1:
 * 1
 * 
 * Sample Output 1:
 * move up
 *
 * @author (Ruari Mears)
 * @version (13.01.2021)
 */
public class Direction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int directionNum = scan.nextInt();
        String direction = ""; 
        
        switch (directionNum) {            
            case 1:
                direction = "move up";
                break;
            case 2:
                direction = "move down";
                break;
            case 3:
                direction = "move left";
                break;
            case 4:
                direction = "move right";
                break;
            case 0:
                direction = "do not move";
                break;
            default:
                direction = "error";
                break;
        }
        
        System.out.println(direction);
    }
}
