package Assignment_3;

public class employee_class_1 {
	
	//instance variable
	
	int id;
	String name;
	int salary;
	
	//static varibales
	
	static String companyname="Wipro";
	static String location="Mumbai";
	
	
	void detailShow(int id1,String name1,int salary1) {
		int bonus=5000;
		
		id=id1;
		name=name1;
		salary=salary1;
		
		System.out.println("id          :"+id);
		System.out.println("name        :"+name);
		System.out.println("salary      :"+salary);
		System.out.println("companyname :"+companyname);
		System.out.println("location    :"+location);
		System.out.println("bounous     :"+bonus);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee_class_1 emp=new employee_class_1();
		
		emp.detailShow(1,"anish",10000);

	}

}
