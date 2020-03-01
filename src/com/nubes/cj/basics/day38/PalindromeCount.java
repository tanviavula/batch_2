package com.nubes.cj.basics.day38;

public class PalindromeCount {

		public int palindromeCount(String data) {
			int count = 0;
			for(String s:data.split(",")) {
				if(isPalindrome(s)) {
					count++;
				}
			}
			return count;
		}
		
		private boolean isPalindrome(String d) {
			return new StringBuffer(d).reverse().equals(d);
	    }
}
