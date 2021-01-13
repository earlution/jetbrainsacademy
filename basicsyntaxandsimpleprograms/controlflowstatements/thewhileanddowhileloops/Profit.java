package basicsyntaxandsimpleprograms.controlflowstatements.thewhileanddowhileloops;

import java.util.*;

/**
 * Ann put M money in the bank. The bank increases Ann's deposit by P percent 
 * every year. Ann wants to know how many years should pass until her deposit 
 * in the bank reaches K money. Can you help her to answer this question?
 * 
 * The input contains three integers M, P, K.  It is guaranteed that all 
 * numbers are positive and K ≥ M.
 * 
 * Output the answer to Ann's question.
 *
 * @author (Ruari Mears)
 * @version (15.10.2020)
 */
public class Profit {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double moneyM = scanner.nextDouble();
        double interestP = scanner.nextDouble();
        double depositK = scanner.nextDouble();
        int years = 0;
        
        while (depositK > moneyM) {
            moneyM = moneyM + moneyM * (interestP / 100);
            years++;
        }
        
        System.out.println(years);
    }
}
