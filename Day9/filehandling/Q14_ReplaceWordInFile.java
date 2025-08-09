package Assignment9_filehandling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q14_ReplaceWordInFile {
    public static void main(String[] args) {
        String inputFile = "story.txt";
        String outputFile = "updated_story.txt";
        String oldWord = "Java";
        String newWord = "Python";

        try {
            // Read entire content
            String content = new String(Files.readAllBytes(Paths.get(inputFile)));

            // Replace all occurrences
            content = content.replaceAll("\\b" + oldWord + "\\b", newWord);

            // Write updated content
            Files.write(Paths.get(outputFile), content.getBytes());

            System.out.println("Replaced '" + oldWord + "' with '" + newWord + "' and saved to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}
