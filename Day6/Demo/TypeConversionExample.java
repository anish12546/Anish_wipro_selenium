package Assignmnet6;

public class TypeConversionExample {
    public static void main(String[] args) {
        int x = 5;

        // Uncommenting the line below will cause a compile-time error:
        // x = x + 4.5;

        // Explanation:
        // x is an int, and 4.5 is a double.
        // x + 4.5 results in a double.
        // Trying to assign a double to an int without explicit casting causes a compile-time error.
        // So, this line does NOT compile unless you cast it like this: x = (int)(x + 4.5);

        // But this line compiles:
        x += 4.5;

        // Explanation:
        // x += 4.5 is a compound assignment.
        // Java automatically casts the result to int (narrowing conversion) when using +=, -=, etc.
        // So, (x += 4.5) is equivalent to: x = (int)(x + 4.5);

        System.out.println("Value of x after x += 4.5: " + x); // Output: 9
    }
}
