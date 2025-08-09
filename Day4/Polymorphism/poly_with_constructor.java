package assignment_4;

//Superclass
class veh {
 veh() {
     System.out.println("Vehicle Created");
 }

 void run() {
     System.out.println("Vehicle is running");
 }
}

//Subclass
class Bike extends veh {
 Bike() {
     super(); 
     System.out.println("Bike Created");
 }

 void run() {
     System.out.println("Bike is running safely");
 }
}


public class poly_with_constructor {
 public static void main(String[] args) {
     
     Bike bk = new Bike(); // Vehicle reference, Bike object
     bk.run(); // Calls Bike's overridden method
 }
}



