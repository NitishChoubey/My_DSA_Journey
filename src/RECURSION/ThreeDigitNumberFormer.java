package RECURSION;

import java.util.HashSet;
import java.util.Set;

public class ThreeDigitNumberFormer {
    public static Set<Integer> findUniqueNumbers(int[] digits) {
        // A HashSet is used to store the numbers, as it automatically handles duplicates.
        Set<Integer> uniqueNumbers = new HashSet<>();
        int n = digits.length;

        // We need at least 3 elements to form a 3-digit number with distinct digits.
        if (n < 3) {
            return uniqueNumbers;
        }

        // Three nested loops to pick 3 distinct digits from the array.
        // Loop for the hundreds place
        for (int i = 0; i < n; i++) {
            // Loop for the tens place
            for (int j = 0; j < n; j++) {
                // Loop for the units place
                for (int k = 0; k < n; k++) {

                    // Condition 1: Ensure we are using three different elements from the array.
                    if (i == j || j == k || i == k) {
                        continue; // Skip if any two indices are the same.
                    }

                    // Condition 2: The first digit (hundreds place) cannot be 0.
                    if (digits[i] == 0) {
                        continue; // Skip if the number would not be a 3-digit number.
                    }

                    // Form the 3-digit number
                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    uniqueNumbers.add(number);
                }
            }
        }
        return uniqueNumbers;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4};
        Set<Integer> result = findUniqueNumbers(inputArray);
        System.out.println("Input Array: " + java.util.Arrays.toString(inputArray));
        System.out.println("Unique 3-digit numbers formed: " + result);
        System.out.println("Total count: " + result.size());


        System.out.println("---");

        int[] inputArrayWithZero = {0, 1, 2};
        Set<Integer> resultWithZero = findUniqueNumbers(inputArrayWithZero);
        System.out.println("Input Array: " + java.util.Arrays.toString(inputArrayWithZero));
        System.out.println("Unique 3-digit numbers formed: " + resultWithZero);
        System.out.println("Total count: " + resultWithZero.size());
    }
}
