//Q16 
package assignment_11;

import java.sql.*;
import java.util.Scanner;

public class LibraryManagement {

    // Get DB connection
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/libarary";  
        String user = "root";                                   
        String password = "root";                               
        return DriverManager.getConnection(url, user, password);
    }

    // Add a book method
    public static void addBook(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter publisher: ");
        String publisher = sc.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        String sql = "INSERT INTO books (book_id, title, author, publisher, quantity) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, bookId);
        pst.setString(2, title);
        pst.setString(3, author);
        pst.setString(4, publisher);
        pst.setInt(5, quantity);

        int result = pst.executeUpdate();
        if (result > 0) {
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Error adding book.");
        }
        pst.close();
    }

    // View all books method
    public static void viewBooks(Connection con) throws SQLException {
        String sql = "SELECT * FROM books";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        System.out.println("BookID\tTitle\tAuthor\tPublisher\tQuantity");
        while (rs.next()) {
            System.out.println(rs.getInt("book_id") + "\t" +
                               rs.getString("title") + "\t" +
                               rs.getString("author") + "\t" +
                               rs.getString("publisher") + "\t" +
                               rs.getInt("quantity"));
        }

        rs.close();
        st.close();
    }

    // Issue book method
    public static void issueBook(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter book ID to issue: ");
        int bookId = sc.nextInt();

        System.out.print("Enter member ID: ");
        int memberId = sc.nextInt();

        // Check book quantity
        String checkSql = "SELECT quantity FROM books WHERE book_id = ?";
        PreparedStatement pstCheck = con.prepareStatement(checkSql);
        pstCheck.setInt(1, bookId);
        ResultSet rs = pstCheck.executeQuery();

        if (rs.next()) {
            int qty = rs.getInt("quantity");
            if (qty > 0) {
                // Insert issue record
                String insertSql = "INSERT INTO issued_books (book_id, member_id, issue_date) VALUES (?, ?, CURDATE())";
                PreparedStatement pstInsert = con.prepareStatement(insertSql);
                pstInsert.setInt(1, bookId);
                pstInsert.setInt(2, memberId);
                pstInsert.executeUpdate();
                pstInsert.close();

                // Update quantity
                String updateSql = "UPDATE books SET quantity = quantity - 1 WHERE book_id = ?";
                PreparedStatement pstUpdate = con.prepareStatement(updateSql);
                pstUpdate.setInt(1, bookId);
                pstUpdate.executeUpdate();
                pstUpdate.close();

                System.out.println("Book issued successfully.");
            } else {
                System.out.println("Book out of stock.");
            }
        } else {
            System.out.println("Book not found.");
        }
        rs.close();
        pstCheck.close();
    }

    // Return book method
    public static void returnBook(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter issue ID to return: ");
        int issueId = sc.nextInt();

        String checkSql = "SELECT book_id, return_date FROM issued_books WHERE issue_id = ?";
        PreparedStatement pstCheck = con.prepareStatement(checkSql);
        pstCheck.setInt(1, issueId);
        ResultSet rs = pstCheck.executeQuery();

        if (rs.next()) {
            Date retDate = rs.getDate("return_date");
            if (retDate != null) {
                System.out.println("Book already returned.");
            } else {
                int bookId = rs.getInt("book_id");

                // Update return_date
                String updateIssued = "UPDATE issued_books SET return_date = CURDATE() WHERE issue_id = ?";
                PreparedStatement pstUpdateIssued = con.prepareStatement(updateIssued);
                pstUpdateIssued.setInt(1, issueId);
                pstUpdateIssued.executeUpdate();
                pstUpdateIssued.close();

                // Increase book quantity
                String updateBookQty = "UPDATE books SET quantity = quantity + 1 WHERE book_id = ?";
                PreparedStatement pstUpdateQty = con.prepareStatement(updateBookQty);
                pstUpdateQty.setInt(1, bookId);
                pstUpdateQty.executeUpdate();
                pstUpdateQty.close();

                System.out.println("Book returned successfully.");
            }
        } else {
            System.out.println("Invalid issue ID.");
        }

        rs.close();
        pstCheck.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        try {
            Connection con = getConnection();

            while (choice != 5) {
                System.out.println("\n1. Add Book");
                System.out.println("2. View Books");
                System.out.println("3. Issue Book");
                System.out.println("4. Return Book");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addBook(con, sc);
                        break;
                    case 2:
                        viewBooks(con);
                        break;
                    case 3:
                        issueBook(con, sc);
                        break;
                    case 4:
                        returnBook(con, sc);
                        break;
                    case 5:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice, try again.");
                }
            }

            con.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
