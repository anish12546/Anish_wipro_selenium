package Assignmnet6;

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();


        double fahrenheit = celsius * 9 / 5 + 32;

        
        int truncatedFahrenheit = (int) fahrenheit;

        
        System.out.println("Fahrenheit (precise): " + fahrenheit);
        System.out.println("Fahrenheit (truncated to int): " + truncatedFahrenheit);

       
    }
}

