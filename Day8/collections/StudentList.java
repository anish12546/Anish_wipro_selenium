//Q9
package Assignment8_Collection;

import java.util.ArrayList;


class Student {
 int id;
 String name;
 double marks;

 
 public Student(int id, String name, double marks) {
     this.id = id;
     this.name = name;
     this.marks = marks;
 }


 public String toString() {
     return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
 }
}

public class StudentList {
 public static void main(String[] args) {
     
     ArrayList<Student> students = new ArrayList<>();

     
     students.add(new Student(101, "Anish", 85.5));
     students.add(new Student(102, "Riya", 91.2));
     students.add(new Student(103, "Karan", 78.0));

     System.out.println("Student Details:");
     for (Student s : students) {
         System.out.println(s);
     }
 }
}

