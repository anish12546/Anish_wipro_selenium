//Q1

package Assignmnet6_Exception_handling;

public class ExceptionDemo {
    public static void main(String[] args) {
        //operation 1: Divide by zero
        try {
            int a = 10;
            int b = 0;
            int result = a / b;  
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero! Please provide a non-zero divisor.");
        } finally {
            System.out.println("Operation completed.");
        }

        //  operation 2: Access array out of bounds
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5];  
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds! Please use a valid index.");
        }finally {
            System.out.println("Operation completed.");
        }
    }
}
