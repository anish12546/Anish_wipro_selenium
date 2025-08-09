//Q2
package Assignment8_Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringWithStack {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        
        Stack<Character> stack = new Stack<>();

        
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        
        System.out.println("Reversed string: " + reversed.toString());

        
    }
}
