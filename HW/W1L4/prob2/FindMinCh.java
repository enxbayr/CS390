package W1L4.prob2;

public class FindMinCh {
	
	private static int pos;
	private static char mc; 
	
	private static void findMin(String str, int pos) {
		if(pos == str.length()) System.out.println(mc);
		else if(pos == 0){
			mc = str.charAt(pos);
			pos++;
			findMin(str, pos);
		}
		else {
			mc = (mc < str.charAt(pos)) ? mc : str.charAt(pos);
			pos++;
			findMin(str, pos);
		}
	}
	
	public static void findMin(String str) {
		findMin(str, 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "winteriscoming";
		
		findMin(str);

	}

}
