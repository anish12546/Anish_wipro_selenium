//Q8
package assignment6_enum_package;

public class CalculatorSwitch {

    enum Operation {
        PLUS, MINUS, TIMES, DIVIDE;

        public double eval(double a, double b) {
            switch (this) {
                case PLUS:   return a + b;
                case MINUS:  return a - b;
                case TIMES:  return a * b;
                case DIVIDE: return a / b;
                default:throw new IllegalStateException("Unknown op: " + this);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.eval(5, 4));    // 8.0
        System.out.println(Operation.DIVIDE.eval(10, 2)); // 5.0
    }
}

