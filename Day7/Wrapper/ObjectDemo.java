//Q4
package Assignment_7;


class Box {
 int length;

 Box(int length) {
     this.length = length;
 }
}


public class ObjectDemo {

 // Method that modifies the Box object's length
 public static void changeLength(Box b) {
     System.out.println("Inside method - original length: " + b.length);
     b.length = 100; 
     System.out.println("Inside method - modified length: " + b.length);
 }

 public static void main(String[] args) {
     Box myBox = new Box(50);
     System.out.println("Before method call: length = " + myBox.length);

     changeLength(myBox); // Pass object to method

     System.out.println("After method call: length = " + myBox.length); 
 }
}
