package W1L2;

public class Prob8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] < arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
				
			}
			
		}
		
		System.out.println("The minimum element in the arrays is: " + arr[arr.length - 1]);

	}

}
