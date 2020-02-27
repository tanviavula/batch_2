package com.nubes.cj.day37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.nubes.cj.basics.day37.ArrayOperations;

class ArrayOperationSpec {

	@Test
	void withValidSubArray() {
		ArrayOperations obj = new ArrayOperations();
		assertEquals(true, obj.isSubset(new int[] {1,2,3,4},new int[] {2,3}));
	}
	
	@Test
	void withNotAValidSubArray() {
		ArrayOperations obj = new ArrayOperations();
		assertEquals(false, obj.isSubset(new int[] {1,2,3,4},new int[] {2,3,5}));
	}
	@Test
	void withSmallArrayBiggerThanBigArray() {
		ArrayOperations obj = new ArrayOperations();
		assertEquals(false, obj.isSubset(new int[] {1,2,3},new int[] {1,2,3,4,5,2,3,5}));
	}

}
