package Assignment9;
//q12

import java.util.*;

class Book2 implements Comparable<Book2> {
    int id;
    String title;
    String author;

    Book2(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    
    public int compareTo(Book2 other) {
        return this.id - other.id; // Sort by ID
    }

    
    public String toString() {
        return id + " - " + title + " by " + author;
    }

    public static void main(String[] args) {
        List<Book2> books = Arrays.asList(
            new Book2(103, "Java", "Gosling"),
            new Book2(101, "Python", "Guido"),
            new Book2(102, "Java", "Bloch")
        );

        Collections.sort(books); // Sort by ID
        System.out.println("Sorted by ID:");
        books.forEach(System.out::println);

        books.sort(Comparator.comparing((Book2 b) -> b.title)
                             .thenComparing(b -> b.author)); // Sort by title, then author
        System.out.println("\nSorted by Title, then Author:");
        books.forEach(System.out::println);
    }
}
