package assignment_4;

class hospital{
	String hospitalname;
	String hospitallocation;
	
	
	hospital(String name,String loca){
		this.hospitalname=name;
		this.hospitallocation=loca;
	}
	
	void display() {
		System.out.println("hospital name :"+hospitalname);
		System.out.println("location :"+hospitallocation);
	}
}

class patient extends hospital{
	
	String name;
	int age;
	
	patient(String hospitalname,String hospitallocation,String name,int age){
		super(hospitalname,hospitallocation);
		this.name=name;
		this.age=age;
		
		
	}
	
	void display() {
		System.out.println("patient name :"+name);
		System.out.println("age :"+age);
		super.display();
	}
	
}

public class hospital_superclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 patient p=new patient("city hospital","mumbai","anish",21);
		 
		 p.display();
	}

}
