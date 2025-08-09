//Q1
package Assignment8_Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
       
        Stack<Integer> stack = new Stack<>();

       
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack after pushing 5 elements: " + stack);

        
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after pop: " + stack);

        
        int top = stack.peek();
        System.out.println("Current top element (peek): " + top);

        
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
