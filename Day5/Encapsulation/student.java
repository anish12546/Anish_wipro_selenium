package assignment_5;

//q1

public class student {
	
	private int rollno;
	private String name;
	private int marks;
	
	student(int rollno,String name,int marks){
		this.rollno=rollno;
		this.name=name;
		if(isValidmarks(marks)) {
			this.marks=marks;
		}else {
			this.marks=0;
		}
	}
	
	public boolean isValidmarks(int marks) {
		return marks>=0 &&  marks<=100;
	}
	
	public String getname() {
		return name;
	}
	
	public int getrollno() {
		return rollno;
	}
	public int getmarks() {
		return marks;
	}
	
	
	public void inputmarks(int newmarks) {
		
		if(isValidmarks(newmarks)&& newmarks>this.marks) {
			this.marks=newmarks;
		}else {
			System.out.println("Invalid or lower marks. Update rejected.");
		}
	}
	
	public void displaydetail() {
		System.out.println("name :"+name);
		System.out.println("rollno :"+rollno);
		System.out.println("marks :"+marks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student st=new student(21,"anish",99);
		
		st.displaydetail();
		System.out.println();
		
		System.out.println("after update score ");
		st.inputmarks(100);
		st.displaydetail();

	}

}
