package Assignment9_filehandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q13_WordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search in notes.txt: ");
        String word = sc.nextLine();

        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader("notes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(word.toLowerCase())) {
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        if (found) {
            System.out.println("Word '" + word + "' found in notes.txt");
        } else {
            System.out.println("Word '" + word + "' NOT found in notes.txt");
        }
        sc.close();
    }
}
