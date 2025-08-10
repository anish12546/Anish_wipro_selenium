package JDBC;

import java.sql.*;

public class hospital_demo {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hopital"; 
        String user = "root";
        String password = "root";

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");

            // 1. Call AvgPatientCountPerDay procedure
            CallableStatement stmt = con.prepareCall("{CALL AvgPatientCountPerDay()}");
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                double avg = rs.getDouble(1);
                System.out.println("Average Patients Per Day: " + avg);
            }

            rs.close();
            stmt.close();

            // 2. Call GetPatientsByWard procedure
            int wardNo = 2;
            CallableStatement stmt1 = con.prepareCall("{CALL GetPatientsByWard(?)}");
            stmt1.setInt(1, wardNo);
            ResultSet rs1 = stmt1.executeQuery();

            System.out.println("\nPatients in Ward " + wardNo + ":");
            while (rs1.next()) {
                int id = rs1.getInt("PatientID");
                String name = rs1.getString("PatientName");
                Date admissionDate = rs1.getDate("AdmissionDate");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Admission Date: " + admissionDate);
                System.out.println("---------------------------");
            }

            rs1.close();
            stmt1.close();

            // 3. Call GetPatientsSortedByAdmissionDate procedure
            CallableStatement stmt2 = con.prepareCall("{CALL GetPatientsSortedByAdmissionDate()}");
            ResultSet rs2 = stmt2.executeQuery();

            System.out.println("\nPatients Sorted by Admission Date:");
            while (rs2.next()) {
                int id = rs2.getInt("PatientID");
                String name = rs2.getString("PatientName");
                int ward = rs2.getInt("WardNo");
                Date date = rs2.getDate("AdmissionDate");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Ward No: " + ward);
                System.out.println("Admission Date: " + date);
                System.out.println("---------------------------");
            }

            rs2.close();
            stmt2.close();

            // Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
