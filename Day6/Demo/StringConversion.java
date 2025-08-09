package Assignmnet6;

public class StringConversion {
    public static void main(String[] args) {
        int originalInt = 123;

        // Convert int to String using String.valueOf(...)
        String stringValue = String.valueOf(originalInt);
        System.out.println("String value: " + stringValue);

        try {
            // Convert String back to int using Integer.parseInt(...)
            int parsedInt = Integer.parseInt(stringValue);
            System.out.println("Parsed int: " + parsedInt);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid format for integer parsing.");
        }

        // Try with an invalid string to demonstrate exception
        String invalidString = "123abc";
        try {
            int badInt = Integer.parseInt(invalidString); // Will throw exception
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException for input: \"" + invalidString + "\"");
        }
    }
}
