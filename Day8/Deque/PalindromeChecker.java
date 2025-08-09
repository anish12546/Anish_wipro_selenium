//Q1
package Assignment8_DeQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is NOT a palindrome.");
        }

        
    }

    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        // Add all chars to deque
        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

