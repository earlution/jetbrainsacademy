package basicsyntaxandsimpleprograms.methods.ArraysAsParameters;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implement a method for sorting a given array of integers in the ascending order.
 * 
 * You can use any algorithm for sorting it.
 * 
 * Sample Input:
 * 3 1 2
 * 
 * Sample Output:
 * 1 2 3 
 *
 * @author (Ruari Mears)
 * @version (26.01.2021
 */
public class SortingNumbers {

    /** Function to sort array using insertion sort
     * https://www.geeksforgeeks.org/insertion-sort */
    public static void insertionSort(int... arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are greater than key, 
             * to one position ahead of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void sort(int[] numbers) {
        insertionSort(numbers);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}
