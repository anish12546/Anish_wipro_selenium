//Q6
package Assignment_7;


class Student {
 String name;
 int marks;

 Student(String name, int marks) {
     this.name = name;
     this.marks = marks;
 }
}

//Main class
public class StudentMarks {

 // Method to update marks of the student
 public static void updateMarks(Student s, int newMarks) {
     System.out.println("Inside method - before update: " + s.name + " has " + s.marks + " marks.");
     s.marks = newMarks;
     System.out.println("Inside method - after update: " + s.name + " has " + s.marks + " marks.");
 }

 public static void main(String[] args) {
     Student student = new Student("anish", 90);
     System.out.println("Before method call: " + student.name + " has " + student.marks + " marks.");

     updateMarks(student, 95);  // Modify the marks

     System.out.println("After method call: " + student.name + " has " + student.marks + " marks.");
 }
}

