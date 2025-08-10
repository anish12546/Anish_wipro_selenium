package assignment_5;


interface Polygon { 

    double getArea(); 

    default double getPerimeter(int... sides) { 

        double sum = 0; 

        for (int s : sides)  

        	sum += s; 

        return sum; 

    } 

    static String shapedetails() { 

        return "A polygon is a closed shape with straight sides."; 

    } 

} 

class Rect implements Polygon { 

    double length, width; 

    Rect(double l, double w) {  

    	length = l; 

    	width = w;  

    	} 

    public double getArea() {  

    	return length * width;  

    	} 

} 

class Triangle implements Polygon { 

    double base, height; 

    Triangle(double b, double h) {  

    	base = b; 

    	height = h;  

    	} 

    public double getArea() {  

    	return 0.5 * base * height;  

    	} 

} 

public class Q6 { 

    public static void main(String[] args) { 

        Rect rect = new Rect(3,2); 

        Triangle tri = new Triangle(2,7); 

        System.out.println("Rectangle area: " + rect.getArea()); 

        System.out.println("Rectangle perimeter: " + rect.getPerimeter(4,6,4,6)); 

        System.out.println("Triangle area: " + tri.getArea()); 

        System.out.println("Triangle perimeter: " + tri.getPerimeter(3, 2, 5)); 

        System.out.println(Polygon.shapedetails()); 

    } 

} 