package W1L4.prob1;

public class MergeStr {

	static String merge(String s1, String s2) {
		if ((s1 == null || s1.equals("")) && (s2 == null || s2.equals("")))
			return "";
		else {
			if ((s1 != null || !s1.equals("")) && (s2 == null || s2.equals(""))) {
				return s1.substring(0, 1) + merge(s1.substring(1), s2);
			} else if ((s1 == null || s1.equals("")) && (s2 != null || !s2.equals(""))) {
				return s2.substring(0, 1) + merge(s1, s2.substring(1));
			} else {
				return s1.substring(0, 1) + s2.substring(0, 1) + merge(s1.substring(1), s2.substring(1));

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ace";
		String str2 = "bdf";

		System.out.println(merge(str1, str2));

	}

}
