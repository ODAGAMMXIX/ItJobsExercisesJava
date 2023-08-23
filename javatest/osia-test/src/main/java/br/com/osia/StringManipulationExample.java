package br.com.osia;
import java.util.Scanner;

public class StringManipulationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a sample string
        String originalString = "Hello, World!";
        
        System.out.println("Original String: " + originalString);
        waitForInput(scanner);

        // Convert the string to uppercase
        String uppercaseString = originalString.toUpperCase();
        System.out.println("Uppercase: " + uppercaseString);
        waitForInput(scanner);

        // Convert the string to lowercase
        String lowercaseString = originalString.toLowerCase();
        System.out.println("Lowercase: " + lowercaseString);
        waitForInput(scanner);

        // Get the length of the string
        int length = originalString.length();
        System.out.println("Length: " + length);
        waitForInput(scanner);

        // Extract a substring
        String substring = originalString.substring(7, 12); // "World"
        System.out.println("Substring: " + substring);
        waitForInput(scanner);

        // Replace a substring
        String replacedString = originalString.replace("Hello", "Hi");
        System.out.println("Replaced: " + replacedString);
        waitForInput(scanner);

        // Check if the string contains a specific substring
        boolean containsWorld = originalString.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
        waitForInput(scanner);

        // Split the string into an array of substrings
        String[] words = originalString.split(" ");
        System.out.println("Split: ");
        for (String word : words) {
            System.out.println(word);
        }
        waitForInput(scanner);

        // Remove leading and trailing whitespace
        String stringWithWhitespace = "   Spaces around   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Trimmed: '" + trimmedString + "'");
        waitForInput(scanner);

        // Concatenate strings
        String part1 = "Hello";
        String part2 = "World";
        String combinedString = part1 + ", " + part2 + "!";
        System.out.println("Combined: " + combinedString);
        waitForInput(scanner);
        
        scanner.close();
    }

    private static void waitForInput(Scanner scanner) {
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }
}
