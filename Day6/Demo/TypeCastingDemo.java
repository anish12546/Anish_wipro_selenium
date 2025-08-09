package Assignmnet6;

import java.util.Scanner;

public class TypeCastingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer value: ");
        int intValue = scanner.nextInt();

        // Implicit widening conversion from int to double
        double widenedValue = intValue;

        
        System.out.println("Integer value: " + intValue);
        System.out.println("Widened to double: " + widenedValue);

        // Read a double value from user input
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        // Explicit casting from double to int 
        int castedInt = (int) doubleValue;

        // Explicit casting from int to short 
        short castedShort = (short) castedInt;

       
        System.out.println("Original double: " + doubleValue);
        System.out.println("Casted to int : " + castedInt);
        System.out.println("Casted to short : " + castedShort);

        
    }
}
