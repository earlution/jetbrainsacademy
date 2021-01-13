package basicsyntaxandsimpleprograms.operationsonprimitivetypes.FloatingPointTypes;

import java.util.Scanner;

/**
 * Write a program that reads the distance between the two cities in miles and the travel time by bus in hours, 
 * and outputs the average speed of the bus.
 * 
 * Note: there is NO need to give any explanations during input and output.
 * 
 * Sample Input 1:
 * 100
 * 2
 * 
 * Sample Output 1:
 * 50.0
 *
 * @author (Ruari Mears)
 * @version (07/12/2020)
 */
public class Distance
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int travelTime = scanner.nextInt();
        
        float averageSpeed = distance / travelTime;
        
        System.out.println(averageSpeed);        
    }
}
