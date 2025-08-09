//Q19
package assignment10;


import java.io.*;

class Employee implements Serializable {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class SerializeEmployee {
    public static void main(String[] args) throws IOException {
        Employee emp = new Employee("Alice", 1001);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
        oos.writeObject(emp);
        oos.close();
    }
}
