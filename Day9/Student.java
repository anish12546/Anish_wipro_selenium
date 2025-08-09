package Assignment9;
//q5

import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

   
    public int compareTo(Student other) {
        return this.rollNo - other.rollNo;
    }

    
    public String toString() {
        return rollNo + " - " + name + " - " + marks;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", 85.5));
        students.add(new Student(1, "Bob", 90.0));
        students.add(new Student(2, "Charlie", 75.0));

        Collections.sort(students);

        System.out.println("Sorted by roll number:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
