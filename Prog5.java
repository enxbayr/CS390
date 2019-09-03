package W1L2;

import java.util.Arrays;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[4][4];
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = RandomNumbers.getRandomInt(1, 99);
				
			}		
		}
		//Use String.format, printf()
		
		for (int el : arr[0]) System.out.printf("%3d\t", el);
		System.out.println();
		for (int el : arr[1]) System.out.printf("+%d\t", el);
		System.out.println();
		System.out.println("---" + "\t" + "---" + "\t" + "---" + "\t" + "---");
		System.out.println("\n");
		for (int el : arr[2]) System.out.printf("%3d\t", el);
		System.out.println();
		for (int el : arr[3]) System.out.printf("+%d\t", el);
		System.out.println();
		System.out.println("---" + "\t" + "---" + "\t" + "---" + "\t" + "---");

	}

}
