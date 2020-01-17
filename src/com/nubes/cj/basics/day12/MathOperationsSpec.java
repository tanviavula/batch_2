package com.nubes.cj.basics.day12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathOperationsSpec {

	@Test
	void biggestOfThreeNumbers() {
		MathOperations obj = new MathOperations();
		int res = obj.biggest(10, 45, 15);
		assertEquals(45, res);
	}
	@Test
	void biggestOfThreeNumbersNegativeNumber() {
		MathOperations obj = new MathOperations();
		int res = obj.biggest(-10, -45,-1);
		assertEquals(-1, res);
	}
	
	@Test
	void biggestOfThreeNumbersSameValues() {
		MathOperations obj = new MathOperations();
		int res = obj.biggest(10,10,10);
		assertEquals(10, res);
	}
	
	@Test
	void factorial() {
		MathOperations obj = new MathOperations();
		int res = obj.factorial(5);
		assertEquals(120, res);
	}
}
