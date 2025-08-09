package assignmentt3_array;

public class prime_number {
	    public static boolean isPrime(int num) {
	    	
	        if (num <= 1) 
	        return false;
	        
	        for (int i = 2; i < num; i++) {
	            if (num % i == 0) 
	            	return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int[] arr = {4, 5, 6, 7, 8, 9, 11, 13, 15};

	        System.out.println("Prime numbers in the array:");
	        for (int num : arr) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }
	    }
	}


