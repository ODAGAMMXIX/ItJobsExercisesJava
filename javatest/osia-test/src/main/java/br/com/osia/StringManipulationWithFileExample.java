package br.com.osia;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringManipulationWithFileExample {
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

        // ... (other string manipulation operations)

        // Create a .csv file and write data
        String filePath = "/home/maquiavelli/Desktop/quickAccess/ItJobsExercisesJava/JavaOutPut/sample.csv";
        createAndWriteCSV(filePath, originalString);
        System.out.println("Data written to CSV file.");
        waitForInput(scanner);

        // Read and process the CSV file
        readAndProcessCSV(filePath);

        scanner.close();
    }

    private static void waitForInput(Scanner scanner) {
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    static void createAndWriteCSV(String filePath, String data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("Original String,Character Positions");
            for (int i = 0; i < data.length(); i++) {
                writer.println(data + "," + i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private static void readAndProcessCSV(String filePath) {
        List<String> results = new ArrayList<>();
    
        try (Scanner scanner = new Scanner(new File(filePath))) {
            // Skip the header line
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
    //NOT READING THE FILE
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String originalString = parts[0];
                    int position = Integer.parseInt(parts[1]);
                    String result = "Original String: " + originalString + ", Position: " + position;
                    results.add(result);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error occurred: " + e.getMessage());
        }
    
        // Print the results
        for (String result : results) {
            System.out.println(result);
        }
    }

    public static void readAndProcessCSV(String filePath, StringBuilder results) {
    }
    

}
