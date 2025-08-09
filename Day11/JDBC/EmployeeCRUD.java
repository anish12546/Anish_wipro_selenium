//Q7

package assignment_11;

import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD {

    // Get database connection
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "root"; 
        return DriverManager.getConnection(url, user, password);
    }

    // Add employee
    public static void addEmployee(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        String sql = "INSERT INTO employee (emp_id, name, department, salary) VALUES (?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setString(3, dept);
        pst.setDouble(4, salary);
        int row = pst.executeUpdate();
        System.out.println(row + " employee added.");
        pst.close();
    }

    // View all employees
    public static void viewEmployees(Connection conn) throws SQLException {
        String sql = "SELECT * FROM employee ORDER BY emp_id";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        System.out.println("ID\tName\tDepartment\tSalary");
        while (rs.next()) {
            System.out.println(rs.getInt("emp_id") + "\t" + rs.getString("name") + "\t" + rs.getString("department") + "\t" + rs.getDouble("salary"));
        }
        rs.close();
        st.close();
    }

    // Update employee
    public static void updateEmployee(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new Name: ");
        String name = sc.nextLine();
        System.out.print("Enter new Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter new Salary: ");
        double salary = sc.nextDouble();

        String sql = "UPDATE employee SET name = ?, department = ?, salary = ? WHERE emp_id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, name);
        pst.setString(2, dept);
        pst.setDouble(3, salary);
        pst.setInt(4, id);
        int rows = pst.executeUpdate();
        if (rows > 0) {
            System.out.println("Employee updated.");
        } else {
            System.out.println("Employee not found.");
        }
        pst.close();
    }

    // Delete employee
    public static void deleteEmployee(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM employee WHERE emp_id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        int rows = pst.executeUpdate();
        if (rows > 0) {
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }
        pst.close();
    }

    // Main menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        try {
            Connection conn = getConnection();
            while (choice != 5) {
                System.out.println("\n--- Employee Management ---");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                } else {
                    System.out.println("Invalid input, enter a number.");
                    sc.next();
                    continue;
                }

                switch (choice) {
                    case 1:
                        addEmployee(conn, sc);
                        break;
                    case 2:
                        viewEmployees(conn);
                        break;
                    case 3:
                        updateEmployee(conn, sc);
                        break;
                    case 4:
                        deleteEmployee(conn, sc);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
