package Assignment9_filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Q1_WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt");
            writer.write("Alice\n");
            writer.write("Bob\n");
            writer.write("Charlie\n");
            writer.write("David\n");
            writer.write("Eva\n");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
