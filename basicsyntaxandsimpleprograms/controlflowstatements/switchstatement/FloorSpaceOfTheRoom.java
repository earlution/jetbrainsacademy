package basicsyntaxandsimpleprograms.controlflowstatements.switchstatement;

import java.util.Scanner;

/**
 * Residents of the country of Malevia often experiment with the plan of their rooms. Rooms 
 * can be triangular, rectangular, and round.
 * 
 * Write a program that calculates the floorage of the rooms.
 * 
 * Input data format
 * The type of the room shape and the relevant parameters.
 * 
 * Output data format
 * The area of the resulting room.
 * 
 * Note: that the value of 3.14 is used instead of the number π in Malevia.
 * Hint: Math library may help you to solve this task.
 * 
 * Input format used by the Malevians:
 *
 * triangle
 * a
 * b
 * c
 * 
 * where a, b and c — lengths of the triangle sides.
 * 
 * rectangle
 * a
 * b
 * 
 * where a and b — lengths of the rectangle sides.
 * 
 * circle
 * r
 * 
 * where r — circle radius.
 * 
 * Note, the input values (a, b, c, r) are doubles and your answer should be, too.
 * 
 * Sample Input 1:
 * rectangle
 * 4
 * 10
 * 
 * Sample Output 1:
 * 40.0
 * 
 * Sample Input 2:
 * circle
 * 5
 * 
 * Sample Output 2:
 * 78.5
 * 
 * Sample Input 3:
 * triangle
 * 3
 * 4
 * 5
 * 
 * Sample Output 3:
 * 6.0
 *
 * @author (Ruari Mears)
 * @version (13.01.2021)
 */
public class FloorSpaceOfTheRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14;
        double a;
        double b;
        double c;
        double r;
        double area;
        double output = 0;
        String roomShape = scan.next();

        switch (roomShape) {
            case "triangle":
                a = scan.nextDouble();
                b = scan.nextDouble();
                c = scan.nextDouble();
                // Heron's Formula for the area of a triangle
                // https://www.mathopenref.com/heronsformula.html
                area = (a + b + c) / 2.0d;
                output = Math.sqrt(area * (area - a) * (area - b) * (area - c));
                break;
            case "rectangle":
                a = scan.nextDouble();
                b = scan.nextDouble();
                output = a * b;
                break;
            case "circle":
                r = scan.nextDouble();
                output = pi * (r * r);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + roomShape);
        }

        System.out.println(output);
    }
}
