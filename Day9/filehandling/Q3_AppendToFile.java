package Assignment9_filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Q3_AppendToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt", true); // true = append mode
            writer.write("Frank\n");
            writer.close();
            System.out.println("Student name appended successfully.");
        } catch (IOException e) {
            System.out.println("Error while appending to file: " + e.getMessage());
        }
    }
}
