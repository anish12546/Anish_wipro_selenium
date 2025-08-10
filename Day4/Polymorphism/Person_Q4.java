package assignment_4;


abstract class Person {
 String name;
 int age;

 Person(String n, int a) {
     name = n;
     age = a;
 }

 abstract void getRoleInfo();
}


class Student extends Person {
 String course;
 int rollNo;

 Student(String n, int a, String c, int r) {
     super(n, a);
     course = c;
     rollNo = r;
 }

 void getRoleInfo() {
     System.out.println("Student Info:");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + course);
     System.out.println("Roll No: " + rollNo);
 }
}


class Professor extends Person {
 String subject;
 double salary;

 Professor(String n, int a, String s, double sal) {
     super(n, a);
     subject = s;
     salary = sal;
 }

 void getRoleInfo() {
     System.out.println("Professor details:");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Subject: " + subject);
     System.out.println("Salary: " + salary);
 }
}

//TeachingAssistant class extends Student
class TeachingAssistant extends Student {
 String assignedTo;

 TeachingAssistant(String n, int a, String c, int r, String prof) {
     super(n, a, c, r);
     assignedTo = prof;
 }

 void getRoleInfo() {
     System.out.println("Teaching Assistant details :");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + course);
     System.out.println("Roll No: " + rollNo);
     System.out.println("Assigned to: " + assignedTo);
 }
}


public class Person_Q4 {
 public static void main(String[] args) {
     Student s = new Student("anish", 20, "BCA", 110);
     Professor p = new Professor("Dr. Sakshi", 30, "Java", 60000);
     TeachingAssistant ta = new TeachingAssistant("janhvi", 22, "BCA", 102, "Dr. Sakshi");

     s.getRoleInfo();
     System.out.println();

     p.getRoleInfo();
     System.out.println();

     ta.getRoleInfo();
 }
}
