

//Q18
package assignment_11;

import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class reportgenrator {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "root"; 
        return DriverManager.getConnection(url, user, password);
    }

    public static void exportToCSV(Connection conn, String tableName, String fileName) {
        String sql = "SELECT * FROM " + tableName;
        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql);
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            ResultSetMetaData rsmd = rs.getMetaData();
            int colCount = rsmd.getColumnCount();

            // Write header
            for (int i = 1; i <= colCount; i++) {
                bw.write(rsmd.getColumnName(i));
                if (i < colCount) bw.write(",");
            }
            bw.newLine();

            // Write data rows
            while (rs.next()) {
                for (int i = 1; i <= colCount; i++) {
                    bw.write(rs.getString(i));
                    if (i < colCount) bw.write(",");
                }
                bw.newLine();
            }
            System.out.println("Data exported successfully to " + fileName);
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table name to export: ");
        String tableName = sc.nextLine();
        System.out.print("Enter output CSV file name (e.g. data.csv): ");
        String fileName = sc.nextLine();

        try (Connection conn = getConnection()) {
            exportToCSV(conn, tableName, fileName);
        } catch (SQLException e) {
            System.out.println("Could not connect to DB: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
