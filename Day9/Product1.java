package Assignment9;
//q7

import java.util.*;

class Product1 {
    int id;
    String name;
    double price;

    Product1(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    
    public String toString() {
        return id + " - " + name + " - $" + price;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Monitor", 8000));
        products.add(new Product(2, "Mouse", 500));
        products.add(new Product(3, "Keyboard", 1500));

        // Price ascending
        products.sort(Comparator.comparingDouble(p -> p.price));
        System.out.println("Sorted by price (ascending):");
        products.forEach(System.out::println);

        // Price descending
        products.sort((p1, p2) -> Double.compare(p2.price, p1.price));
        System.out.println("\nSorted by price (descending):");
        products.forEach(System.out::println);

        // Name alphabetically
        products.sort(Comparator.comparing(p -> p.name));
        System.out.println("\nSorted by name (A-Z):");
        products.forEach(System.out::println);
    }
}

