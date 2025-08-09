package assignment_5;

public final class Product {

    // Final fields for immutability
    private final String name;
    private final String code;
    private final double price;
    private final String category;

    // Private constructor (only Builder can create)
    private Product(Builder builder) {
        this.name = builder.name;
        this.code = builder.code;
        this.price = builder.price;
        this.category = builder.category;
    }

    // Public getters only (no setters)
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    // Optional: readable toString()
    @Override
    public String toString() {
        return "Product [name=" + name + ", code=" + code +
               ", price=" + price + ", category=" + (category != null ? category : "N/A") + "]";
    }

    // Static nested Builder class
    public static class Builder {
        private String name;
        private String code;
        private double price;
        private String category;

        public Builder withName(String name) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Product name cannot be null or empty.");
            }
            this.name = name;
            return this;
        }

        public Builder withCode(String code) {
            if (code == null || code.trim().isEmpty()) {
                throw new IllegalArgumentException("Product code cannot be null or empty.");
            }
            this.code = code;
            return this;
        }

        public Builder withPrice(double price) {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative.");
            }
            this.price = price;
            return this;
        }

        public Builder withCategory(String category) {
            this.category = category; // Optional
            return this;
        }

        // Final build method
        public Product build() {
            if (name == null || code == null) {
                throw new IllegalStateException("Required fields: name and code must be set.");
            }
            return new Product(this);
        }
    }

    // Sample usage
    public static void main(String[] args) {
        try {
            Product p1 = new Product.Builder()
                    .withName("Laptop")
                    .withCode("LPT123")
                    .withPrice(899.99)
                    .withCategory("Electronics")
                    .build();

            System.out.println(p1);

//            // Example: missing name (will throw error)
//            Product p2 = new Product.Builder()
//                    .withCode("X001")
//                    .withPrice(199.99)
//                    .build(); // ❌ will throw exception

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
