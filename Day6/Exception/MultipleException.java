//Q4
package Assignmnet6_Exception_handling;

import java.io.*;
import java.util.Scanner;

public class MultipleException {

    public static void main(String[] args) {
        String filename = "test.txt"; 

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
           

            int number = Integer.parseInt(line);
            int result = 100 / number;
            System.out.println("Result of 100 / " + number + " = " + result);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading file");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } finally {
            System.out.println("Execution completed");
        }
    }
}
