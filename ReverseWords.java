package javaproject;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Split the string into words
        String[] words = input.trim().split("\\s+");

        // Reverse the order of words
        System.out.println("Reversed sentence:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}