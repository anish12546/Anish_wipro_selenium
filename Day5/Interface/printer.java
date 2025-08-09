package assignment_5;


interface Printer_test {
 void print(String document);
}


 class LaserPrinter implements Printer_test {
 
 public void print(String document) {
     System.out.println("LaserPrinter printing: " + document);
 }
}


 class InkjetPrinter implements Printer_test {
 
 public void print(String document) {
     System.out.println("InkjetPrinter printing: " + document);
 }
}


public class printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer_test p;

        
        p = new LaserPrinter();
        p.print("Monthly Report");

        
        p = new InkjetPrinter();
        p.print("Colorful Brochure");

	}

}
