package Assignmnet6;

public class Narrowing {
    public static void main(String[] args) {
        int i = 100;
        byte b1 = 100;          
        byte b2 = (byte) i;    

        //byte b3 = i;         

        final int f = 100;
        byte b4 = f;           

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("b4: " + b4);
    }
}
