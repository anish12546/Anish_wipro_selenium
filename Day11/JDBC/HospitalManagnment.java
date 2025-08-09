
//Q17
package assignment_11;

import java.sql.*;
import java.util.Scanner;

public class HospitalManagnment {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/hospital_db";
        String user = "root";
        String password = "root"; // replace with your password
        return DriverManager.getConnection(url, user, password);
    }

    public static void registerPatient(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        String sql = "INSERT INTO patient (patient_id, name, age, gender) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, age);
            pst.setString(4, gender);
            int row = pst.executeUpdate();
            System.out.println(row + " patient registered.");
        }
    }

    public static void assignDoctor(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter Patient ID: ");
        int patientId = sc.nextInt();
        System.out.print("Enter Doctor ID: ");
        int doctorId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        String sql = "INSERT INTO appointment (patient_id, doctor_id, date) VALUES (?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, patientId);
            pst.setInt(2, doctorId);
            pst.setDate(3, Date.valueOf(date));
            int row = pst.executeUpdate();
            System.out.println(row + " appointment assigned.");
        }
    }

    public static void generateBilling(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter Patient ID: ");
        int patientId = sc.nextInt();
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Billing Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        String sql = "INSERT INTO billing (patient_id, amount, billing_date) VALUES (?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, patientId);
            pst.setDouble(2, amount);
            pst.setDate(3, Date.valueOf(date));
            int row = pst.executeUpdate();
            System.out.println(row + " bill generated.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        try (Connection conn = getConnection()) {
            while (choice != 4) {
                System.out.println("\nMenu:");
                System.out.println("1. Register Patient");
                System.out.println("2. Assign Doctor");
                System.out.println("3. Generate Billing");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                } else {
                    System.out.println("Invalid input! Enter number.");
                    sc.next();
                    continue;
                }

                switch (choice) {
                    case 1:
                        registerPatient(conn, sc);
                        break;
                    case 2:
                        assignDoctor(conn, sc);
                        break;
                    case 3:
                        generateBilling(conn, sc);
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
