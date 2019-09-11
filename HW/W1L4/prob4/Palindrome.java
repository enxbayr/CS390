package W1L4.prob4;

public class Palindrome {

	static boolean cp = false;

	public static boolean checkPal(String str) {
		if (str.length() <= 1)
			return true;
		else {
			if (str.charAt(0) != str.charAt(str.length() - 1)) {
				return false;
			}
			else {
				return checkPal(str.substring(1, str.length() - 1));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rotor";

		boolean res = checkPal(str);
		System.out.println(res);

	}

}
