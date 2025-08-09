//Q1
package assignment6_enum_package;

import java.util.Scanner;

public class Enum_day {

    // 1. Define an enum with 7 constants
    enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for day input
        System.out.print("Enter a day of the week : ");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            // Convert input to enum constant
            DaysOfWeek day = DaysOfWeek.valueOf(input);

            // Print ordinal position (0-based)
            System.out.println("Ordinal position: " + day.ordinal());

            // Check if it's a weekend using switch
            switch (day) {
                case SATURDAY:
                case SUNDAY:
                    System.out.println(day + " is a weekend.");
                    break;
                default:
                    System.out.println(day + " is a weekday.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered. Please enter a valid day .");
        }

      
    }
}
