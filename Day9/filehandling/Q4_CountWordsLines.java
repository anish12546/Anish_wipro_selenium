package Assignment9_filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q4_CountWordsLines {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("notes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+"); // split by whitespace
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading notes.txt: " + e.getMessage());
        }
    }
}
