package basicsyntaxandsimpleprograms.controlflowstatements;

import java.util.Scanner;

/**
 * A program that will classify the army of your enemies corresponding to the 
 * following rules:
 * 
 * less than 1: no army
 * from 1 to 19: pack
 * from 20 to 249: throng
 * from 250 to 999: zounds
 * 1000 and more: legion
 * 
 * @author (Ruari Mears)
 * @version (28.09.2020)
 */
public class TheArmyOfUnits
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int armySize = scanner.nextInt();
        String armyClassification = new String();
        
        if (armySize < 1) {
            armyClassification = "no army";
        } else if (armySize >= 1 && armySize <= 19) {
            armyClassification = "pack";
        } else if (armySize >= 20 && armySize <= 249) {
            armyClassification = "throng";
        } else if (armySize >= 250 && armySize <= 999) {
            armyClassification = "zounds";
        } else if (armySize >= 1000) {
            armyClassification = "legion";
        }
        
        System.out.println(armyClassification);
    }
}
