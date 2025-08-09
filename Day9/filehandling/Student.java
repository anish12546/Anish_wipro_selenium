//Q9
package Assignment9_filehandling;


import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Alice", 89.5);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s);
            System.out.println("Student object serialized to student.ser");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }
}
