package Assignment9_filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q2_ReadFromFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found or error reading file: " + e.getMessage());
        }
    }
}

