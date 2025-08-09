package Assignment9;
//q2

import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(201, "David", 55000));
        employees.add(new Employee(202, "Alice", 60000));
        employees.add(new Employee(203, "Bob", 50000));

        Collections.sort(employees);

        System.out.println("Sorted by name:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
