//Q3
package Assignment_7;

public class PrimitiveDemo {

    // Methods trying to modify primitive values
    public static void changeInt(int a) {
        a = 999;
    }

    public static void changeDouble(double d) {
        d = 3.14159;
    }

    public static void changeChar(char c) {
        c = 'Z';
    }

    public static void changeBoolean(boolean flag) {
        flag = !flag;
    }

    public static void main(String[] args) {
        int x = 10;
        double y = 2.5;
        char ch = 'A';
        boolean status = true;

        // Print before method calls
        System.out.println("Before:");
        System.out.println("int x = " + x);
        System.out.println("double y = " + y);
        System.out.println("char ch = " + ch);
        System.out.println("boolean status = " + status);

        // Call methods
        changeInt(x);
        changeDouble(y);
        changeChar(ch);
        changeBoolean(status);

      
        System.out.println("\nAfter method calls:");
        System.out.println("int x = " + x);             
        System.out.println("double y = " + y);         
        System.out.println("char ch = " + ch);          
        System.out.println("boolean status = " + status); 
    }
}
