package com.nubes.cj.basics.day15;

public class ArrayPalindrome {

	public static void main(String[] args) {
		int arr[] = { 10 , 10 , 30};
		System.out.println(isPalindrome(arr));
	}

	public static boolean isPalindrome(int[] arr) {
		int n = arr.length;
		for (int i = 0; i <= n / 2; i++) {
				if(arr[i] != arr[n - i -1]) {
					return false;
				}
		}
		return true;
	}
}
