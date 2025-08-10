//Q1
package assignment6_enum_package;

import java.util.Scanner;

public class Enum_day {

 
    enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter a day of the week : ");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            
            DaysOfWeek day = DaysOfWeek.valueOf(input);

            
            System.out.println("Ordinal position: " + day.ordinal());

           
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

