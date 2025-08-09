package Assignment9;
//q6

import java.util.*;

class Student1 {
    int rollNo;
    String name;
    double marks;

    Student1(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name + " - " + marks;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 85.5));
        students.add(new Student(2, "Bob", 92.0));
        students.add(new Student(3, "Charlie", 78.0));

        // Using lambda for Comparator
        students.sort((s1, s2) -> Double.compare(s2.marks, s1.marks)); // Descending

        System.out.println("Students sorted by marks (descending):");
        for (Student s : students) System.out.println(s);
    }
}
