package assignment_4;

//multilevel inheritance


class vehicle{
	
	void showVehicletype() {
		System.out.println("this is a vehicle");
	}
}

class FourWheeler extends vehicle{
	void showFourWheelerType() {
        System.out.println("This is a Four Wheeler.");
    }
}

class PetrolFourWheeler extends FourWheeler {
    void showFuelType() {
        System.out.println("This is a Petrol Four Wheeler.");
    }
}

class FiveSeaterPetrolFourWheeler extends PetrolFourWheeler {
    void showSeatingCapacity() {
        System.out.println("This is a Five-Seater Petrol Four Wheeler.");
    }
}
class Baleno extends FiveSeaterPetrolFourWheeler {
    void showModel() {
        System.out.println("This is a Baleno Five-Seater Petrol Four Wheeler.");
    }
}


public class multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baleno  car=new Baleno();
		
		car.showVehicletype();
		car.showFourWheelerType();
		car.showFuelType();
		car.showSeatingCapacity();
		car.showModel();
		
		
	}

}
