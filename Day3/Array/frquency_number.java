package assignmentt3_array;

public class frquency_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] arr = {4, 5, 4, 2, 5, 3, 1, 2, 4};

		        boolean[] visited = new boolean[arr.length];

		        System.out.println("Element frequencies:");

		        for (int i = 0; i < arr.length; i++) {
		            if (!visited[i]) {
		                int count = 1;

		                for (int j = i + 1; j < arr.length; j++) {
		                    if (arr[i] == arr[j]) {
		                        count++;
		                        visited[j] = true;
		                    }
		                }

		                System.out.println(arr[i] + " occurs " + count + " times");
		            }
		        }
		    }

}
