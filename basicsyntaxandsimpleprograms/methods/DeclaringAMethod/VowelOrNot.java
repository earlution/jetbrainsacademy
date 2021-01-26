package basicsyntaxandsimpleprograms.methods.DeclaringAMethod;


import java.util.Scanner;

public class VowelOrNot {

    public static boolean isVowel(char ch) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean test = false;

        // check if the specified element is present in the array or not
        // using Linear Search method
        // https://www.geeksforgeeks.org/check-if-a-value-is-present-in-an-array-in-java/
        for (int element : vowels) {
            if (element == Character.toLowerCase(ch)) {
                test = true;
                break;
            }
        }
        return test;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}