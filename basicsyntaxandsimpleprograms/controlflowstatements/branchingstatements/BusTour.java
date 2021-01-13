package basicsyntaxandsimpleprograms.controlflowstatements.branchingstatements;

import java.util.*;

/**
 * A bus tour of Europe has been very successful. Due to an increase in the 
 * number of people that want to go on a tour, the tour company decided to 
 * increase the height of the bus. The new height of the bus is exactly N 
 * centimeters.
 * 
 * But the tour’s route runs under a lot of bridges, and there is a chance 
 * that the bus will crash into one of these bridges. Can you find out if 
 * this will happen?
 * 
 * The first line of the input contains the height of the bus and the number 
 * of bridges under which the bus passes. The second line contains the 
 * heights of these bridges.
 * 
 * You should output 
 * "Will not crash" 
 * if everything will be all right;  * otherwise, output 
 * "Will crash on bridge i" (where i is a number of a bridge) 
 * into which the bus will crash. If the height of a bridge equals the height 
 * of the bus, the bus will crash.
 * 
 * @author (Ruari Mears)
 * @version (15.10.2020)
 */

public class BusTour {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int busHeight = scanner.nextInt();
        int numOfBridges = scanner.nextInt();
        int[] bridgeHeights = new int[numOfBridges];
        boolean crash = true;
        
        for (int i = 0; i < numOfBridges; i++) {
            bridgeHeights[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < numOfBridges; i++) {
            if (busHeight >= bridgeHeights[i]) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            } else if (busHeight < bridgeHeights[i]) {
                crash = false;
            }
        }
        
        if (crash == false) {
            System.out.println("Will not crash");
        }
    }
}
