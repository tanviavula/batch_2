package com.nubes.cj.basics.day11;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NumberOperationsSpec {

	@Test
	public void sumOfFirstNNumbersTest() {
		int res = NumberOperations.sumOfFirstNNumbers(10);
		assertEquals(55,res);
	}
	
	@Test
	public void factorialWithValidNumber() {
		int res = NumberOperations.factorial(5); // 1 * 2 * 3 * 4 * 5 = 120
		assertEquals(120, res);
	}
	
	@Test
	public void factorialWithZero() {
		int res = NumberOperations.factorial(0); 
		assertEquals(1, res);
	}
	
	@Test
	public void factorialWithOne() {
		int res = NumberOperations.factorial(1); 
		assertEquals(1, res);
	}
	
	@Test
	public void factorialWithNegativeNumber() {
		assertThrows(IllegalArgumentException.class,()->{
			NumberOperations.factorial(-10);
		});
			
	}
	@Test
	public void isPrimeWithZero() {
		boolean res = NumberOperations.isPrime(0);
		assertFalse(res);
	}
	@Test
	public void isPrimeWithOne() {
		boolean res = NumberOperations.isPrime(1);
		assertFalse(res);
	}
	@Test
	public void isPrimeWithPrime() {
		boolean res = NumberOperations.isPrime(13);
		assertTrue(res);
	}
	@Test
	public void isPrimeWithNotPrime() {
		boolean res = NumberOperations.isPrime(12);
		assertFalse(res);
	}
	@Test
	public void isPrimeWithNegativeNumber() {
		assertThrows(IllegalArgumentException.class,()->{
				NumberOperations.isPrime(-10);
		});
		
	}
	@Test
	public void countPrimesInRangeValidRange() {
		int count = NumberOperations.countPrimesInRange(2, 10); //2,3,5,7 => 4
		assertEquals(4, count);
	}
	
	@Test
	public void countPrimesInRangeZeroToOne() {
		int count = NumberOperations.countPrimesInRange(0, 1); 
		assertEquals(0, count);
	}
	
	

}
