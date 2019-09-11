package W1L2;

import java.util.Arrays;

public class Prob7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] len = new int[args.length];
		
		int i = 0;
		int n = 0;
		
		System.out.println("INPUT: " + Arrays.toString(args));
		
		for (String el : args) {
			
			if(el.startsWith("A")) n++;
			
			len[i] = el.length();
			i++;
		}
		
		System.out.println("Each word's length: " + Arrays.toString(len));
		System.out.println("Number of the string inputs starts with ‘A’: " + n);

	}

}
