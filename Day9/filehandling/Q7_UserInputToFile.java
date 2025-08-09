package Assignment9_filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q7_UserInputToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text to write to file (type 'exit' to finish):");
        try (FileWriter writer = new FileWriter("userinput.txt")) {
            String input;
            while (true) {
                input = sc.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(input + System.lineSeparator());
            }
            System.out.println("Input saved to userinput.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        sc.close();
    }
}

