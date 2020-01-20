package com.nubes.cj.basics.day14;

public class CheckSubSetOrNot {

	public static void main(String[] args) {
		int[] big = { 1, 2, 3, 4, 5, 1, 2, 3 };
		int[] small = { 1, 2, 9 };
		System.out.println(isSubSet(big, small));
	}

	public static boolean isSubSet(int[] big, int[] small) {

		for (int i = 0; i < small.length; i++) {
			if (!search(big, small[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean search(int[] a, int ele) {
		boolean isFound = false;
		for (int i = 0; i < a.length; i++) {
			if (ele == a[i]) {
				isFound = true;
			}
		}
		return isFound;
	}

}
