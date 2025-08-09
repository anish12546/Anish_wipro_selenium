package assignment_4;

class after_12{
	
	void showoption() {
		System.out.println("option are availabe");
		
	}
}

class engineering extends after_12{
	
	void showbranches() {
		System.out.println("engineering branch");
	}
}

class it extends engineering{
	
	void showit() {
		System.out.println("you select it");
	}
}

class mech extends engineering{
	
	void showmech() {
		System.out.println("you select mech");
	}
}

class cs extends engineering{
	
	void showcs() {
		System.out.println("you select cs");
	}
}
class medical extends after_12{
	
	void showmedical() {
		System.out.println("Medical courses: MBBS, BDS");
	}
}

class MBBS extends medical{
	void showMBBS() {
        System.out.println("You selected MBBS.");
    }
	
}
class BDS extends medical {
    void showBDS() {
        System.out.println("You selected BDS.");
    }
}

class Other_courses extends after_12 {
    void showOtherCourses() {
        System.out.println("Other courses: BBA, BCA");
    }
}
class BBA extends Other_courses {
    void showBBA() {
        System.out.println("You selected BBA.");
    }
}
class BCA extends Other_courses {
    void showBCA() {
        System.out.println("You selected BCA.");
    }
}


public class hierarchical_12th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 it it = new it();
	        it.showbranches();
	        it.showoption();
	        it.showit();

	        System.out.println("----MBBS------");

	        MBBS mbbs = new MBBS();
	        mbbs.showmedical();
	        mbbs.showMBBS();
	        mbbs.showoption();


	        System.out.println("----BCA------");

	        BCA bca = new BCA();
	        bca.showBCA();
	        bca.showoption();
	        bca.showOtherCourses();
	    }

	}


