package assignment_5;
//q2

public class rectangle {
	
	private double  height;
	private double  width;
	
	rectangle(double height,double width){
		setWidth(width);
		setHeight(height);
	}
	
	public void setWidth(double width) {
		
		if(width>0) {
			this.width=width;
		}else {
			System.out.println("invalid width");
			this.width=1;
		}
	}
	
	 public void setHeight(double height) {
	        if (height > 0) {
	            this.height = height;
	        } else {
	            System.out.println("Invalid height. Setting to default value 1.");
	            this.height = 1;
	        }
	    }
	 
	 public double getwidth() {
		 return width;
	 }
	 
	 public double getheight() {
		 return height;
	 }
	 public double getArea() {
	        return width * height;
	    }

	    public double getPerimeter() {
	        return 2 * (width + height);
	    }
	    
	    public void display() {
	    	
			 System.out.println("Width: " + width);
		        System.out.println("Height: " + height);
		        System.out.println("Area: " + getArea());
		        System.out.println("Perimeter: " + getPerimeter());
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 rectangle r1 = new rectangle(5, 10);
	        r1.display();

	        System.out.println();

	        rectangle r2 = new rectangle(-4, 0); // Invalid input
	        r2.display();
		
	

	}

}
