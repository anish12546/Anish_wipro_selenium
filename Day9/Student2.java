package Assignment9;
//q11

import java.util.*;

class Student2 implements Comparable<Student2> {
    String name;
    double marks;

    Student2(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student2 other) {
        return this.name.compareTo(other.name); // Sort by name
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }

    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2("Charlie", 85.0));
        students.add(new Student2("Alice", 90.0));
        students.add(new Student2("Bob", 75.0));

        Collections.sort(students); // Sort by name (Comparable)
        System.out.println("Sorted by name:");
        students.forEach(System.out::println);

        students.sort(Comparator.comparingDouble(s -> -s.marks)); // Sort by marks descending
        System.out.println("\nSorted by marks (descending):");
        students.forEach(System.out::println);
    }
}
