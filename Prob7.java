package W1L2;

import java.util.Arrays;
import java.util.Scanner;

/*
	Write a program to accept the string inputs from Command line arguments and perform the following.
	a. Print the length of each string input.
	b. Count the string inputs starts with ‘A’.
 */

public class Prob7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner in = new Scanner(System.in);
		System.out.print("Type any String: ");
		
		String str = in.nextLine();
        
		String[] words = str.split(" ");
		*/
		int[] len = new int[args.length];
		
		int i = 0;
		int n = 0;
		
		for (String el : args) {
			
			if(el.startsWith("A")) n++;
			
			len[i] = el.length();
			i++;
		}
		
		
		
		
		
		System.out.println("Each word's length: " + Arrays.toString(len));
		System.out.println("Number of the string inputs starts with ‘A’: " + n);

	}

}
