package com.nubes.cj.basics.day34;

@FunctionalInterface
public interface MathOperation {

		public double compute(double a, double b);
		
		
		//Java 8 
		default double power(double m, double n) {
		
				return Math.pow(m, n);
		}
		public static boolean isPrime(int num) {
			return true;
		}
}
