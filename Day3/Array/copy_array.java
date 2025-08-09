package assignmentt3_array;

public class copy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] source = {1, 2, 3, 4, 5};
		        int[] destination = new int[source.length];

		        for (int i = 0; i < source.length; i++) {
		            destination[i] = source[i];
		        }

		        System.out.println("Copied array:");
		        for (int num : destination) {
		            System.out.print(num + " ");
		        }
		    }


	}


