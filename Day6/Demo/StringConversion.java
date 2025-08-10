package Assignmnet6;

public class StringConversion {
    public static void main(String[] args) {
        int originalInt = 123;

        String stringValue = String.valueOf(originalInt);
        System.out.println("String value: " + stringValue);

        try {
           
            int parsedInt = Integer.parseInt(stringValue);
            System.out.println("Parsed int: " + parsedInt);
        } catch (NumberFormatException e) {
            System.out.println("invalid");
        }

        
        String dString = "123abc";
        try {
            int Int = Integer.parseInt(invalidString);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException for input: \"" + String );
        }
    }
}

