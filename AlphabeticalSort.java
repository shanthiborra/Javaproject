package javaproject;
import java.util.Arrays;

public class AlphabeticalSort {
    public static void main(String[] args) {
        // Array of strings to be sorted
        String[] words = {"banana", "apple", "grape", "cherry", "orange"};

        // Sort the array using Arrays.sort()
        Arrays.sort(words);

        // Print sorted array
        System.out.println("Strings in alphabetical order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
