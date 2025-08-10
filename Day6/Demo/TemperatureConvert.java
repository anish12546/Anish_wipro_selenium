package Assignmnet6;

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();


        double fahrenheit = celsius * 9 / 5 + 32;

        
        int newFahrenheit = (int) fahrenheit;

        
        System.out.println("Fahrenheit " + fahrenheit);
        System.out.println("Fahrenheit  " + newFahrenheit);

       
    }
}



