//Q9
package Assignment_7;

class Student1 {
    String name;

    Student1(String name) {
        this.name = name;
    }
}

public class Primitiveandnonprimitive {

    public static void changeValue(int num) {
        num = 100;
        System.out.println("Inside method: num = " + num);
    }
    

    public static void changeName(Student1 s) {
        s.name = "Updated Name";
        System.out.println("Inside method: name = " + s.name);
    }


    public static void main(String[] args) {
        int original = 50;
        System.out.println("Before method call: original = " + original);
        changeValue(original);
        System.out.println("After method call: original = " + original);
        
        System.out.println("------non primitive----------");
        
        Student1 student = new Student1("Anish");
        System.out.println("Before method call: name = " + student.name);
        changeName(student);
        System.out.println("After method call: name = " + student.name);
        
        
    }
}
