package assignment_5;

interface MinCalculator {
    int min(int a, int b);
}

public class min_lambda {
    public static void main(String[] args) {
        MinCalculator minCalc = (a, b) -> (a < b) ? a : b;

        int minValue = minCalc.min(10, 20);
        System.out.println("Minimum: " + minValue);  // Output: Minimum: 10
    }
}
