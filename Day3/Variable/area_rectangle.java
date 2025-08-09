package Assignment_3;

public class area_rectangle {
	
	int area(int length,int breath ) {
		return length*breath;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		area_rectangle obj=new area_rectangle();
		
		int result=obj.area(3, 4);
		System.out.println("area of rectangle is :"+result);

	}

}
