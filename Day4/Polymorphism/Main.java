
//Q3 vehicle

package assignment_4;


class Vehicle {
 void start() {
     System.out.println("Vehicle is starting...");
 }
}


class Car extends Vehicle {
 void start() {
     System.out.println("Car is starting with key...");
 }
}


class Bike extends Vehicle {
 void start() {
     System.out.println("Bike is starting with kick...");
 }
}


class Truck extends Vehicle {
 void start() {
     System.out.println("Truck is starting with button...");
 }
}

public class Main {


 static void startVehicle(Vehicle v) {
     v.start(); 
 }

 public static void main(String[] args) {

     Car car = new Car();
     Bike bike = new Bike();
     Truck truck = new Truck();

     
     startVehicle(car);   
     startVehicle(bike);   
     startVehicle(truck); 
 }
}
