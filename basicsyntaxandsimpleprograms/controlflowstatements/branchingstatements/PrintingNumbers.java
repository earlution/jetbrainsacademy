package basicsyntaxandsimpleprograms.controlflowstatements.branchingstatements;

/**
 * Branching statements - Printing numbers.
 * 
 * How many numbers does the following code print?
 *
 * @author (Ruari Mears)
 * @version (15.10.2020)
 */
public class PrintingNumbers {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i < 3) {
                continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                }
            }        
        }
    }
}
