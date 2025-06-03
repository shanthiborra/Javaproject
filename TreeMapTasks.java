package xyz;

import java.util.*;

public class TreeMapTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> studentMarks = new TreeMap<>();
        TreeMap<String, String> phoneBook = new TreeMap<>();

        System.out.println(" Store Student Marks");
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 90);
        studentMarks.put("Charlie", 78);
        studentMarks.put("David", 92);

        System.out.println("Stored Student Marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\n Search for a Student's Marks");
        System.out.print("Enter student name to search: ");
        String searchName = scanner.nextLine();
        if (studentMarks.containsKey(searchName)) {
            System.out.println(searchName + "'s marks: " + studentMarks.get(searchName));
        } else {
            System.out.println("Student not found.");
        }
        System.out.println("\n=== Task 3: Phone Book ===");
        phoneBook.put("Alice", "123-456-7890");
        phoneBook.put("Bob", "987-654-3210");
        phoneBook.put("Eve", "555-123-4567");

        System.out.println("Phone Book Entries:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.print("Enter name to look up phone number: ");
        String contactName = scanner.nextLine();
        if (phoneBook.containsKey(contactName)) {
            System.out.println(contactName + "'s phone number: " + phoneBook.get(contactName));
        } else {
            System.out.println("Contact not found.");
        }

        scanner.close();
    }
}
