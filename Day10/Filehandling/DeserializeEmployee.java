//Q20
package assignment10;

import java.io.*;

public class DeserializeEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
        Employee emp = (Employee) ois.readObject();
        ois.close();
        System.out.println("Name: " + emp.name + ", ID: " + emp.id);
    }
}
