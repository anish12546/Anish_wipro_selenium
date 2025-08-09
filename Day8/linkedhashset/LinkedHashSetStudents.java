//Q2
package Assignment8_LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Objects;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class LinkedHashSetStudents {
    public static void main(String[] args) {
        LinkedHashSet<Student> students = new LinkedHashSet<>();

        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Charlie"));
        students.add(new Student(1, "Alice")); // Duplicate — will not be added

        System.out.println("Students in LinkedHashSet:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

