package JDBC;



import java.sql.*;

public class EmployeeOperation {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java"; 
        String user = "root";
        String password = "root";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connected to database");
            System.out.println();

            // 1. Highest and Lowest Salary
            CallableStatement cs1 = con.prepareCall("{CALL highlow()}");
            cs1.execute();
            System.out.println("=== Highest and Lowest Salary ===");

            String sql1 = "SELECT MAX(salary) AS highest_salary, MIN(salary) AS lowest_salary FROM employee";
            Statement stmt1 = con.createStatement();
            ResultSet rs1 = stmt1.executeQuery(sql1);

            if (rs1.next()) {
                double highest = rs1.getDouble("highest_salary");
                double lowest = rs1.getDouble("lowest_salary");
                System.out.println("Highest Salary: " + highest);
                System.out.println("Lowest Salary: " + lowest);
            }

            System.out.println();

            // 2. Duplicate Employee Names
            System.out.println("=== Duplicate Employee Names ===");
            CallableStatement cs2 = con.prepareCall("{CALL print_duplicate_name()}");
            ResultSet rs2 = cs2.executeQuery();

            while (rs2.next()) {
                String empName = rs2.getString("name");
                int count = rs2.getInt("count");
                System.out.println(empName + " - " + count + " times");
            }

            System.out.println();

            // 3. Add Bonus to All Employees
            System.out.println("=== Bonus Update ===");
            CallableStatement cs3 = con.prepareCall("{CALL add_bonus_all()}");
            cs3.execute();
            System.out.println("Bonus of 5000 added to all employees.");
            System.out.println();

            Statement stmt2 = con.createStatement();
            ResultSet rs3 = stmt2.executeQuery("SELECT * FROM employee");

            System.out.println("All Employees After Bonus:");
            System.out.println("--------------------------");

            while (rs3.next()) {
                int id = rs3.getInt("id");
                String name = rs3.getString("name");
                double salary = rs3.getDouble("salary");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Salary: " + salary);
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
