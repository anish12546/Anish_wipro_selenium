//Q15

package assignment_11;

import java.sql.*;
import java.util.Scanner;

public class menudrive {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anish";
        String user = "root";
        String password = "root";
        return DriverManager.getConnection(url, user, password);
    }

    public static void insertStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter student id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();

        String sql = "INSERT INTO student (id, name, percentage) VALUES (?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setDouble(3, percentage);
        int row = pst.executeUpdate();
        System.out.println(row + " record inserted.");
        pst.close();
    }

    public static void searchStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter student id to search: ");
        int id = sc.nextInt();

        String sql = "SELECT * FROM student WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if(rs.next()) {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Percentage: " + rs.getDouble("percentage"));
        } else {
            System.out.println("Student not found.");
        }
        rs.close();
        pst.close();
    }

    public static void updateStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter student id to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter new percentage: ");
        double percentage = sc.nextDouble();

        String sql = "UPDATE student SET name=?, percentage=? WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, name);
        pst.setDouble(2, percentage);
        pst.setInt(3, id);
        int rows = pst.executeUpdate();
        if(rows > 0) {
            System.out.println("Student updated.");
        } else {
            System.out.println("Student not found.");
        }
        pst.close();
    }

    public static void deleteStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter student id to delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM student WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        int rows = pst.executeUpdate();
        if(rows > 0) {
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
        pst.close();
    }

    public static void listAllStudents(Connection conn) throws SQLException {
        String sql = "SELECT * FROM student ORDER BY id";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        System.out.println("ID\tName\tPercentage");
        boolean empty = true;
        while(rs.next()) {
            empty = false;
            System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getDouble("percentage"));
        }
        if(empty) {
            System.out.println("No records found.");
        }
        rs.close();
        st.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        try {
            Connection conn = getConnection();

            while(choice != 6) {
                System.out.println("\nMenu:");
                System.out.println("1. Insert Student");
                System.out.println("2. Search Student");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. List All Students");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                if(sc.hasNextInt()) {
                    choice = sc.nextInt();
                } else {
                    System.out.println("Invalid input! Enter a number.");
                    sc.next();  // consume invalid input
                    continue;
                }

                switch(choice) {
                    case 1: insertStudent(conn, sc); break;
                    case 2: searchStudent(conn, sc); break;
                    case 3: updateStudent(conn, sc); break;
                    case 4: deleteStudent(conn, sc); break;
                    case 5: listAllStudents(conn); break;
                    case 6: System.out.println("Exiting..."); break;
                    default: System.out.println("Invalid choice! Try again."); break;
                }
            }

            conn.close();
        } catch(SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
