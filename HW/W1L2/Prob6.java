package W1L2;

import java.util.Arrays;

public class Prob6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"horse", "dog", "cat", "horse","dog"};
		
		int l = 0;
		
		for(int i = 0; i < str.length - 1; i++) {
			for(int j = i + 1; j < str.length; j++){
				if(str[i] == str[j]) {
					str[i] = "";
					l++;
				}
			}
		}
		
		String[] nDup = new String[str.length - l];
		
		int k = 0;
		
		for(String el : str) {
			if(el != "") {
				nDup[k] = el;
				k++;
			}
			
		}
		
		System.out.println(Arrays.toString(nDup));
		
	}

}
