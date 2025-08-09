package assignment_4;

abstract class smartdevice{
	
	abstract void turnon();
	abstract void turnoff();
	abstract void performfunction();
}

class smartphone extends smartdevice{
	
	void turnon() {
		System.out.println("SmartPhone is turning on...");
	}
	
	void turnoff() {
		 System.out.println("SmartPhone is turning off...");
	}
	
	 void performfunction() {
	        System.out.println("SmartPhone is performing calling and browsing.");
	    }
}

class smartwatch extends smartdevice{
	
	void turnon() {
		System.out.println("smartwatch is turning on...");
	}
	
	void turnoff() {
		 System.out.println("smartwatch is turning off...");
	}
	
	 void performfunction() {
	        System.out.println("smartwatch is performing calling and browsing.");
	    }
}
class smartspeaker extends smartdevice{
	
	void turnon() {
		System.out.println("smartspeaker is turning on...");
	}
	
	void turnoff() {
		 System.out.println("smartspeaker is turning off...");
	}
	
	 void performfunction() {
	        System.out.println("smartspeaker is performing calling and browsing.");
	    }
}

public class abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smartdevice [] dev= {new smartphone(),new smartwatch(),new smartspeaker()};
		
		for(smartdevice device:dev) {
			  device.turnon();
	            device.performfunction();  
	            device.turnoff();
	           System.out.println("--------------*-----------------");
			
		}

	}

}
