//Q5
package Assignment_7;


class Person {
 String name;
 int age;

 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
}


public class ObjectDemo2 {

 
 public static void updatePerson(Person p) {
    
     p.name = "Updated Name";
     p.age = 99;
     System.out.println("Inside method - updated: " + p.name + ", age " + p.age);
 }

 public static void main(String[] args) {
     Person person = new Person("Alice", 30);
     System.out.println("Before method call: " + person.name + ", age " + person.age);

     updatePerson(person); // Pass the object

     System.out.println("After method call: " + person.name + ", age " + person.age);
 }
}
