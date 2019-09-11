package W1L4.prob3;

public class binarySearch {

	private static int bSearch(int[] arr, int tar, int l, int m, int r) {

		if (l <= r) {

			if (arr[m] == tar)
				return m;
			if (arr[m] < tar) {
				return bSearch(arr, tar, m++, (m + 1 + r) / 2, r);

			} else {
				return bSearch(arr, tar, l, (l + m - 1) / 2, m - 1);
			}
		}
		return -1;
	}

	public static int bSearch(int[] arr, int tar) {
		return bSearch(arr, tar, 0, (arr.length - 1) / 2, arr.length - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int tar = 3;

		int result = bSearch(arr, tar);
		System.out.println(result);

	}

}
