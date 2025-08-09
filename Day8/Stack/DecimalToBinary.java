//Q4
package Assignment8_Stack;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        
        String binary = convertToBinary(decimal);
        System.out.println("Binary representation: " + binary);

        
    }

    public static String convertToBinary(int number) {
        if (number == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 2);  
            number = number / 2;
        }

        
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}

