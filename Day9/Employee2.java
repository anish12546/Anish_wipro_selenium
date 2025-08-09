package Assignment9;
//q13

import java.util.*;

class Employee2 {
    String name;
    double salary;
    String department;

    Employee2(String name, double salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.department = dept;
    }

    
    public String toString() {
        return name + " - " + department + " - $" + salary;
    }

    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2("Alice", 50000, "HR"));
        list.add(new Employee2("Bob", 60000, "IT"));
        list.add(new Employee2("Charlie", 55000, "Finance"));

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sort by Name");
        System.out.println("2. Sort by Salary");
        System.out.println("3. Sort by Department");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                list.sort(Comparator.comparing(e -> e.name));
                break;
            case 2:
                list.sort(Comparator.comparingDouble(e -> e.salary));
                break;
            case 3:
                list.sort(Comparator.comparing(e -> e.department));
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("\nSorted Employees:");
        list.forEach(System.out::println);
    }
}
