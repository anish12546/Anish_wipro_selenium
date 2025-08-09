package assignment_4;

class Vehicle{
	
	String type="generic car";
	
	Vehicle(){
		System.out.println("vehicle constructor called");
	}
	
	void display() {
		System.out.println("this is a vehicle");
	}
}

class car extends Vehicle{
	
	String type="suv car";
	
	car(){
		super();
		System.out.println("car constructor is called");
	}
	
	void show() {
		//refer to a car 
		System.out.println(type);
		
		//refer to a parent class vehicle car
		System.out.println(super.type);
	}
}
public class super_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 car ca=new car();
		 
		 ca.show();
	}

}
