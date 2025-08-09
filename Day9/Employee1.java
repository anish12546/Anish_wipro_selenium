package Assignment9;
//q8

import java.time.LocalDate;
import java.util.*;

class Employee1 {
    String name;
    LocalDate joiningDate;

    Employee1(String name, LocalDate joiningDate) {
        this.name = name;
        this.joiningDate = joiningDate;
    }

    
    public String toString() {
        return name + " - Joined on: " + joiningDate;
    }

    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("Alice", LocalDate.of(2022, 5, 20)));
        employees.add(new Employee1("Bob", LocalDate.of(2021, 1, 10)));
        employees.add(new Employee1("Charlie", LocalDate.of(2023, 3, 15)));

        // Sort by joining date (oldest to newest)
        employees.sort(Comparator.comparing(emp -> emp.joiningDate));

        System.out.println("Employees sorted by joining date:");
        employees.forEach(System.out::println);
    }
}

