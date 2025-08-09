//Q10
package assignment10;

import java.io.*;

class Student implements Serializable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializeStudent {
    public static void main(String[] args) throws IOException {
        Student s = new Student("John", 21);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
        oos.writeObject(s);
        oos.close();
    }
}

