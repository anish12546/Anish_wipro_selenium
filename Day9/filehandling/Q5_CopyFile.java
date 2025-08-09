package Assignment9_filehandling;

import java.io.*;

public class Q5_CopyFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("source.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("destination.txt"))) {
             
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();  
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
