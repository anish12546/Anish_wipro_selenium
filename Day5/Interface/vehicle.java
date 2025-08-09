package assignment_5;

 interface BaseVehicle {
    void start();
}

 interface AdvancedVehicle extends BaseVehicle {
    void stop();
    boolean refuel(int amount);
}

 class Car implements AdvancedVehicle {
	    private int fuel;

	    public Car(int initialFuel) {
	        this.fuel = initialFuel;
	    }

	
	    public void start() {
	        if (fuel > 0) {
	            System.out.println("Car started. Fuel level: " + fuel);
	            fuel--;
	        } else {
	            System.out.println("Cannot start car. Fuel is empty.");
	        }
	    }

	    
	    public void stop() {
	        System.out.println("Car stopped.");
	    }

	   
	    public boolean refuel(int amount) {
	        if (amount > 0) {
	            fuel += amount;
	            System.out.println("Car refueled. New fuel level: " + fuel);
	            return true;
	        } else {
	            System.out.println("Refuel amount must be positive.");
	            return false;
	        }
	    }
	}


public class vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BaseVehicle baseVehicle = new Car(2);
		  baseVehicle.start();
		  
		  AdvancedVehicle advVehicle = (AdvancedVehicle) baseVehicle;
		  advVehicle.stop();   
		  advVehicle.refuel(3);
		  advVehicle.start();

	}

}
