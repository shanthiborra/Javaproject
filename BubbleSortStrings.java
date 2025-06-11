package javaproject;
public class BubbleSortStrings {
    public static void main(String[] args) {
        // Array of strings to be sorted
        String[] words = {"shanthi", "vani", "anusha", "mamatha", "pandu"};

        // Bubble sort algorithm
        int n = words.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent strings
                if (words[j].compareTo(words[j + 1]) > 0) {
                    // Swap if out of order
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Print sorted strings
        System.out.println("Strings sorted using Bubble Sort:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
