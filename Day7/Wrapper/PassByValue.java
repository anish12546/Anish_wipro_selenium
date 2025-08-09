//Q1
package Assignment_7;

public class PassByValue {

    // Method that tries to change the value of the integer
    public static void changeValue(int num) {
        num = 100;
        System.out.println("Inside method, after change: " + num);
    }

    public static void main(String[] args) {
        int original = 50;
        System.out.println("Before method call: " + original);

        changeValue(original);  // Pass the value
        
        System.out.println("After method call: " + original);  
    }
}
