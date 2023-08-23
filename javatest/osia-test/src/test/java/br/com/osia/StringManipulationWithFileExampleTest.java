package br.com.osia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringManipulationWithFileExampleTest {

    @Test
    public void testUppercaseConversion() {
        String originalString = "Hello, World!";
        String expectedUppercase = "HELLO, WORLD!";
        String actualUppercase = originalString.toUpperCase();
        assertEquals(expectedUppercase, actualUppercase);
    }

    // Add more test methods for other methods in your class

    @Test
    public void testCreateAndReadCSV() {
        String filePath = "test.csv"; // Use a test-specific file path
        String originalString = "Hello, World!";
        
        // Create and write CSV
        StringManipulationWithFileExample.createAndWriteCSV(filePath, originalString);
        
        // Read and process CSV
        StringBuilder results = new StringBuilder();
        StringManipulationWithFileExample.readAndProcessCSV(filePath, results);

        String expectedOutput = "Original String: Hello, World!, Position: 0";
        assertTrue(results.toString().contains(expectedOutput));
    }
}
