package assignment_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class student1{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 String url = "jdbc:mysql://localhost:3306/student";
	        String user = "root";
	        String password = "root";

	        // Load the JDBC driver
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        //Q1 Establish the connection
	        Connection con = DriverManager.getConnection(url, user, password);
	        System.out.println("Connection created");
	        
	        Statement stm=con.createStatement();
	        
	        
	        //Q2 insert student data
	        String query = "INSERT INTO student (id, name, percent) VALUES (?, ?, ?)";
	        PreparedStatement pst = con.prepareStatement(query);
	        pst.setInt(1, 1);
	        pst.setString(2, "Alice");
	        pst.setDouble(3, 82.5);
	        pst.executeUpdate();
	        System.out.println("Student inserted.");
	        
	        //Q3 fetch all student data
	        ResultSet rs = stm.executeQuery("SELECT * FROM student");

	        while (rs.next()) {
	            System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getDouble("percent"));
	        }
	        
	        //Q4 search by id
	        int id = 1;
	        PreparedStatement pst1 = con.prepareStatement("SELECT * FROM student WHERE id = ?");
	        pst1.setInt(1, id);
	        ResultSet rs1 = pst1.executeQuery();

	        if (rs1.next()) {
	            System.out.println("Found: " + rs1.getString("name"));
	        } else {
	            System.out.println("Student not found.");
	        }
	        
	        // Q5 update 
	        String query1 = "UPDATE student SET name = ?, percent = ? WHERE id = ?";
	        PreparedStatement pst2 = con.prepareStatement(query1);
	        pst2.setString(1, "Bob");
	        pst2.setDouble(2, 90.0);
	        pst2.setInt(3, 1);
	        int rows = pst2.executeUpdate();
	        System.out.println(rows + " record(s) updated.");
	        
	        // Q6 delete
	        String querydelete = "DELETE FROM student WHERE id = ?";
	        PreparedStatement pstdel = con.prepareStatement(querydelete);
	        pstdel.setInt(1, 1);
	        pstdel.executeUpdate();
	        System.out.println("Student deleted.");
	        
	        //Q8 count
	        Statement stmt = con.createStatement();
	        ResultSet rscount = stmt.executeQuery("SELECT COUNT(*) FROM student");
	        if (rscount.next()) {
	            System.out.println("Total students: " + rscount.getInt(1));
	        }
	        
	        // Q9 sort by ascending
	        Statement stmtsort = con.createStatement();
	        ResultSet rssort = stmtsort.executeQuery("SELECT * FROM student ORDER BY name ASC");
	        while (rssort.next()) {
	            System.out.println(rssort.getString("name")); 
	        }
	        
	        // Q10 higher percent >75
	        PreparedStatement pstper = con.prepareStatement("SELECT * FROM student WHERE percent > 75");
	        ResultSet rsper = pstper.executeQuery();
	        while (rsper.next()) {
	            System.out.println(rsper.getString("name") + " - " + rsper.getDouble("percent"));
	        }
	        
	        //Q11 add multiple row
	        PreparedStatement pstadd = con.prepareStatement("INSERT INTO student (id, name, percentage) VALUES (?, ?, ?)");
	        for (int i = 1; i <= 3; i++) {
                pst.setInt(1, i);
                pst.setString(2, "Student" + i);
                pst.setDouble(3, 70 + i);
                int row = pst.executeUpdate(); 
                System.out.println("Inserted row " + i + ": " + row + " row(s) affected.");
                
	        }
	        
	        //Q13 Handle exception
	        try { 
	            
	            PreparedStatement pstexc = con.prepareStatement("SELECT * FROM student WHERE id = ?");
	            pstexc.setInt(1, -1);
	            ResultSet rsexc = pstexc.executeQuery();

	            if (!rsexc.next()) {
	                System.out.println("No student found with this ID.");
	            }

	           
	        } catch (SQLException e) {
	            System.out.println("Database error: " + e.getMessage());
	        }
	        
	        
	        
	        //Q14 user check
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Username: ");
	        String username = sc.nextLine();
	        System.out.print("Password: ");
	        String pass = sc.nextLine();
	        
	        PreparedStatement pstcheck = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
	        pstcheck.setString(1, username);
	        pstcheck.setString(2, pass);
	        ResultSet rscheck = pstcheck.executeQuery();

	        if (rscheck.next()) {
	            System.out.println("Login successful.");
	        } else {
	            System.out.println("Invalid credentials.");
	        }
	        
	        
	        
	        
	    }
	        

	}



