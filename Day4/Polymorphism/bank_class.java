package assignment_4;


class bank{
	
	double getintrestrate() {
		return 0.0;
		
	}
	
}

class SBI extends bank{
	
	double getintrestrate() {
		return 6.7;
	}
}

class ICICI extends bank{
	double getintrestrate() {
		return 7.0;
	}
}

class HDFC extends bank{
	double getintrestrate(){
		return 7.5;
	}
}
public class bank_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI sb=new SBI();
		System.out.println("SBI Interest Rate "+sb.getintrestrate());
		
		HDFC hd=new HDFC();
		System.out.println("HDFC Interest Rate "+hd.getintrestrate());
		
		ICICI ic=new ICICI();
		System.out.println("ICICI Interest Rate "+ic.getintrestrate());
		

	}

}
