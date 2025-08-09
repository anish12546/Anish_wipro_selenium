package Assignment9;
//q3

import java.util.*;

class Book implements Comparable<Book> {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

   
  
    public int compareTo(Book other) {
        return other.bookId - this.bookId;
    }

  
    public String toString() {
        return bookId + " - " + title + " by " + author;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(105, "Java Programming", "James Gosling"));
        books.add(new Book(102, "Python Basics", "Guido van Rossum"));
        books.add(new Book(110, "Effective Java", "Joshua Bloch"));

        Collections.sort(books);

        System.out.println("Books sorted by bookId (descending):");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
