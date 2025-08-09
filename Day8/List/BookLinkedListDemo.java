//Q9
package Assignment8_LinkedList;

import java.util.LinkedList;

class Book {
    int id;
    String title;
    String author;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void display() {
        System.out.println("Book ID: " + id + ", Title: " + title + ", Author: " + author);
    }
}

public class BookLinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<Book> bookList = new LinkedList<>();

       
        bookList.add(new Book(201, "Pride and Prejudice", "Jane Austen"));
        bookList.add(new Book(202, "The Hobbit", "J.R.R. Tolkien"));
        bookList.add(new Book(203, "Moby Dick", "Herman Melville"));
       
        System.out.println("Books in the list:");
        for (Book book : bookList) {
            book.display();
        }
    }
}
