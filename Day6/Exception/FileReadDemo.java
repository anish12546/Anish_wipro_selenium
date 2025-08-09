//Q3
package Assignmnet6_Exception_handling;

import java.io.*;

public class FileReadDemo {

    public static void readFile(String filename) throws FileNotFoundException, IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
            String firstLine = br.readLine();
            System.out.println("First line: " + firstLine);
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }

    public static void main(String[] args) {
        String filename = "test.txt";

        try {
            readFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            System.out.println("Cleanup done.");
        }
    }
}
