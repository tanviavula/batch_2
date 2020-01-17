package com.nubes.cj.basics.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BiggestThreeNumbersSpec {

		@Test
		public void biggestWithPositiveNumbers() {
			int big = BiggestThreeNumbers.biggest(10, 30, 20);
			assertEquals(30, big);
		}
		@Test
		public void biggestWithNegativeNumbers() {
			int big = BiggestThreeNumbers.biggest(-10, -20, -5);
			assertEquals(-5, big);
		}
		@Test
		public void biggestWithSameNumber() {
			int big = BiggestThreeNumbers.biggest(10, 10, 10);
			assertEquals(10,big);
		}
}
