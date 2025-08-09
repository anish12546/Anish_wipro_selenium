package assignment_4;

class shape{
	
	void area() {
		System.out.println("this is area");
	}
	
}

class circle extends shape{
	double radius;
	
	circle(double radius){
		this.radius=radius;
	}
	 void area() {
		 System.out.println(radius*radius);
		 
	 }
}


class rectangle extends shape{
	double length,breath;
	
	rectangle(double length,double breath){
		this.length=length;
		this.breath=breath;
	}
	 void area() {
		 System.out.println(length*breath);
		 
	 }
}

public class shape_override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circle cr=new circle(2);
		cr.area();
		
		rectangle rec=new rectangle(1,3);
		rec.area();

	}

}
