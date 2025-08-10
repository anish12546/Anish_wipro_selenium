package assignment_4;

interface MyDrawable { 

	 void draw(); 

	} 

	abstract class MyShape implements MyDrawable { 

	 abstract void area(); 

	} 

	class MyCircle extends MyShape { 

	 double radius = 8; 

	 public void draw() { 

	     System.out.println("Drawing Circle"); 

	 } 

	 public void area() { 

	     double area = 3.14 * radius * radius; 

	     System.out.println("Area of Circle: " + area); 

	 } 

	} 

	class MyRectangle extends MyShape { 

	 double length = 7; 

	 double breadth = 7; 

	 public void draw() { 

	     System.out.println("Drawing Rectangle"); 

	 } 

	 public void area() { 

	     double area = length * breadth; 

	     System.out.println("Area of Rectangle: " + area); 

	 } 

	} 

	class MyTriangle extends MyShape { 

	 double base = 4; 

	 double height = 4; 

	 public void draw() { 

	     System.out.println("Drawing Triangle"); 

	 } 

	 public void area() { 

	     double area = 0.5 * base * height; 

	     System.out.println("Area of Triangle: " + area); 

	 } 

	} 

	public class Shape_Q5{ 

	    public static void main(String[] args) { 

	        MyShape circle = new MyCircle(); 

	        MyShape rectangle = new MyRectangle(); 

	        MyShape triangle = new MyTriangle(); 

	        System.out.println("=== Circle ==="); 

	        circle.draw(); 

	        circle.area(); 

	        System.out.println("\n=== Rectangle ==="); 

	        rectangle.draw(); 

	        rectangle.area(); 

	        System.out.println("\n=== Triangle ==="); 

	        triangle.draw(); 

	        triangle.area(); 

	    } 

	} 