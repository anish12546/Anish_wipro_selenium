package Assignment9_filehandling;

import java.io.*;
import java.util.*;

public class Q8_ReverseFileContent {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        // Read all lines from data.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("reversed.txt"))) {
            for (int i = lines.size() - 1; i >= 0; i--) {
                writer.write(lines.get(i));
                writer.newLine();
            }
            System.out.println("File reversed.txt created with reversed content.");
        } catch (IOException e) {
            System.out.println("Error writing reversed file: " + e.getMessage());
        }
    }
}
