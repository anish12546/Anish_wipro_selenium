package assignment_5;

interface MaxCalculator {
    int max(int a, int b);
}

public class max_lambda {
    public static void main(String[] args) {
        MaxCalculator maxCalc = (a, b) -> (a > b) ? a : b;

        int maxValue = maxCalc.max(10, 20);
        System.out.println("Maximum: " + maxValue);  // Output: Maximum: 20
    }
}