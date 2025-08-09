//Q3
package assignment6_enum_package;

public class ShapeArea {

    enum Shape {
        CIRCLE, SQUARE, RECTANGLE, TRIANGLE;
    }

    public static void main(String[] args) {
        // Sample values for each shape
        double radius = 5;
        double side = 4;
        double length = 6, width = 3;
        double base = 10, height = 4;

        for (Shape shape : Shape.values()) {
            double area = 0;

            if (shape == Shape.CIRCLE) {
                area = Math.PI * radius * radius;
                System.out.println("CIRCLE area: " + area);
            } else if (shape == Shape.SQUARE) {
                area = side * side;
                System.out.println("SQUARE area: " + area);
            } else if (shape == Shape.RECTANGLE) {
                area = length * width;
                System.out.println("RECTANGLE area: " + area);
            } else if (shape == Shape.TRIANGLE) {
                area = 0.5 * base * height;
                System.out.println("TRIANGLE area: " + area);
            }
        }
    }
}
