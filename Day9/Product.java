package Assignment9;
//Q1

import java.util.*;

class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return id + " - " + name + " - $" + price;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Keyboard", 1500.00));
        products.add(new Product(102, "Mouse", 500.00));
        products.add(new Product(103, "Monitor", 8000.00));

        Collections.sort(products);

        System.out.println("Sorted by price:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
