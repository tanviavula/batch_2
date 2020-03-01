package com.nubes.cj.day38;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nubes.cj.basics.day38.PalindromeCount;

public class PalindromeSpec {

	@Test
	public void withZeroPalindromeString() {
		PalindromeCount obj = new PalindromeCount();
		String s = "ABC,LMN,PQR,1223";
		assertEquals(0, obj.palindromeCount(s));
		
	}

	@Test
	public void witPalindromeString() {
		PalindromeCount obj = new PalindromeCount();
		String s = "ABCBC,LMNML,PQR,12321";
		assertEquals(2, obj.palindromeCount(s));
	}
}
