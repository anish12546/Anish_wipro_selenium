package assignmentt3_array;
import java.util.*;

public class duplicate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 5, 4, 2, 2, 3, 1, 5};

        // Use LinkedHashSet to maintain order
        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) {
            unique.add(num);
        }

        System.out.println("Array without duplicates:"+unique);
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }

	}




